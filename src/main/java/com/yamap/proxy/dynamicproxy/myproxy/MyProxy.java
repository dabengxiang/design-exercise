package com.yamap.proxy.dynamicproxy.myproxy;

import org.apache.commons.lang3.RandomStringUtils;
import sun.reflect.CallerSensitive;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class MyProxy {


    public static final String ln = "\r\n";


    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h){
        try {
            //1.先创建java代码
            String src = generateSrc(interfaces);
            System.out.println(src);
            //2. 把字符串写入文件里面去
            String filePath = MyProxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();

            //3. 加载java文件
            // 3.1 先找到java编译器
            // 3.2读取java编译器的文档管理器，然后用文档管理器读取文件得到java文件对象
            //3.3 得到任务，然后执行，就可以读到内存中了
            JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = javaCompiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> javaFileObjects = fileManager.getJavaFileObjects(file);

            JavaCompiler.CompilationTask task = javaCompiler.getTask(null, fileManager, null,
                    null, null, javaFileObjects);
            task.call();
            fileManager.close();


            Class<?> proxyClass = loader.findClass("$Proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(MyInvocationHandler.class);
            file.delete();


            return constructor.newInstance(h);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;

    }


    private static String generateSrc(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package com.yamap.proxy.dynamicproxy.myproxy;" + ln);
        sb.append("import com.yamap.proxy.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("MyInvocationHandler h;" + ln);
        sb.append("public $Proxy0(MyInvocationHandler h) { " + ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);
        for (Method m : interfaces[0].getMethods()){
            Class<?>[] params = m.getParameterTypes();

            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();

            //遍历参数并且组合传入参数为一个字符串
            //paramNames 是代表形参如 String str,int i    paramValues  str     i
            //paramClasses  String.class int.class
            for (int i = 0; i < params.length; i++) {
                Class clazz = params[i];
                String type = clazz.getName();
                String paramName = randomStr();
                paramNames.append(type + " " +  paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");
                if(i > 0 && i < params.length-1){
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }

            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" + paramNames.toString() + ") {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + ln);
            sb.append((hasReturnValue(m.getReturnType()) ? "return " : "") + getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})",m.getReturnType()) + ";" + ln);
            sb.append("}catch(Error _ex) { }");
            sb.append("catch(Throwable e){" + ln);
            sb.append("throw new UndeclaredThrowableException(e);" + ln);
            sb.append("}");
            sb.append(getReturnEmptyCode(m.getReturnType()));
            sb.append("}");
        }
        sb.append("}" + ln);
        return sb.toString();
    }


    private static String randomStr(){
        return RandomStringUtils.randomAlphanumeric(50);
    }

    /**
     * 把一个字符串的首字母变为小写
     * @param str
     * @return
     */
    private static String toLowerFirstCase(String str){
        char [] chars = str.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);

    }


    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }

    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

    private static String getCaseCode(String code,Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }


    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null;";
        }
    }


}
