package com.yamap.delegate;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class EmployeeB implements  IEmployee {
    @Override
    public void doSomething(String command) {
        System.out.println("我是员工B执行：" + command + "工作");
    }
}
