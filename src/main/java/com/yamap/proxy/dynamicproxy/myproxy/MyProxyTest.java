package com.yamap.proxy.dynamicproxy.myproxy;


import com.yamap.proxy.Person;
import com.yamap.proxy.dynamicproxy.jdkproxy.Girl;

/**
 * Created by Tom on 2019/3/10.
 */
public class MyProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
//            Person obj = (Person) new MyMeipoProxy().getInstance(new Girl());
//            System.out.println(obj.getClass());
//            obj.findLove();


            Animal obj = (Animal) new MyMeipoProxy().getInstance(new Dog());
           System.out.println(obj.getClass());
           int i = obj.method1();
            System.out.println(i);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
