package com.yamap.factory.abstractPackage;

/**
 * project name : design-project
 * Date:2019/3/26
 * Author: yc.guo
 * DESC:
 */
public class JavaCourseFactory extends AbstractFactory {
    public INode createNode() {
        return new JavaNode();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
