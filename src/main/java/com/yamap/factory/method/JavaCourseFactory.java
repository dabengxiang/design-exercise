package com.yamap.factory.method;

import com.yamap.factory.product.Icourse;
import com.yamap.factory.product.JavaCourse;

/**
 * project name : design-project
 * Date:2019/3/26
 * Author: yc.guo
 * DESC:
 */
public class JavaCourseFactory implements ICourseFactory{
    public Icourse create() {
        return new JavaCourse();
    }
}
