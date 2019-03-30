package com.yamap.singleton.test;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import com.yamap.singleton.enume.EnumSingleton;
import com.yamap.singleton.hungry.SeriableSingleton;

import java.io.*;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class SeriableSingletonTest {


    public static void main(String[] args) throws  Exception{
        method1();

    }


    public static void method1() throws IOException, ClassNotFoundException {

        String objName = "SeriableSingleton.obj";
        EnumSingleton s1 = null;

        EnumSingleton s2 = EnumSingleton.getIntance();
        FileOutputStream fos = new FileOutputStream(objName);

        //写入对象
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s2);
        oos.flush();
        oos.close();


        FileInputStream fis = new FileInputStream(objName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (EnumSingleton) ois.readObject();
        ois.close();


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);


    }

}
