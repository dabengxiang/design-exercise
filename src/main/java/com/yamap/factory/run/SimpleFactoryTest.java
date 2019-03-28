package com.yamap.factory.run;

import com.yamap.factory.simple.SimpFactory;
import com.yamap.factory.product.Icourse;
import com.yamap.factory.product.PystonCourse;

/**
 * project name : design-project
 * Date:2019/3/26
 * Author: yc.guo
 * DESC:
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        method1();
        method2();

    }
    
    
    public static  void method1(){
        SimpFactory simpFactory = new SimpFactory();
        Icourse java = simpFactory.create("java");
        java.study();
    }


    public  static void method2(){
        SimpFactory simpFactory = new SimpFactory();
        Icourse java = simpFactory.create(PystonCourse.class);
        java.study();
    }
}
