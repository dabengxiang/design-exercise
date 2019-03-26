package com.yamap.factory.abstractPackage;

/**
 * project name : design-project
 * Date:2019/3/26
 * Author: yc.guo
 * DESC:
 */
public class AbstractTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new JavaCourseFactory();
        abstractFactory.study();

    }
}
