package com.yamap.factory.run;

import com.yamap.factory.method.ICourseFactory;
import com.yamap.factory.method.JavaCourseFactory;
import com.yamap.factory.product.Icourse;

/**
 * project name : design-project
 * Date:2019/3/26
 * Author: yc.guo
 * DESC:
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        method1().study();
    }
        
    
    public static Icourse method1(){
        ICourseFactory courseFactory = new JavaCourseFactory();
        return courseFactory.create();
        
    }
}
