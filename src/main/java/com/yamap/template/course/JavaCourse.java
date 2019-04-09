package com.yamap.template.course;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public class JavaCourse extends NetCoures {
    @Override
    protected void checkHomework() {

        System.out.println("检查java的作业。。");
    }

    @Override
    protected boolean needHomework() {
        return true;
    }
}
