package com.yamap.proxy.dynamicproxy.jdkproxy;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import com.yamap.proxy.Person;
import sun.misc.ProxyGenerator;
import sun.misc.Resource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class JdkProxyTest {
    public static void main(String[] args) throws Exception {
        Girl girl = new Girl();
        MeipoProxy meipoProxy = new MeipoProxy();
        Person instance = (Person) meipoProxy.getInstance(girl);
        instance.findLove();

        //            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();



        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
        os.write(bytes);
        os.close();
    }
}
