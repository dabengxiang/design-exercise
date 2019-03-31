package com.yamap.proxy.dynamicproxy.myproxy;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class Dog implements Animal {
    @Override
    public void method(int i) {
        System.out.println("测试一下： num " + i);
    }


    public int method1(){
        System.out.println("哈哈");
        return 1;
    };

}
