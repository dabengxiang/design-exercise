package com.yamap.template.course;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public class CourseTest {


    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("==========================================");

        PyCourse pyCourse = new PyCourse();
        pyCourse.createCourse();
    }

}
