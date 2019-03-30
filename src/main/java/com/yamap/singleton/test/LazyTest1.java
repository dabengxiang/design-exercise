package com.yamap.singleton.test;

/**
 * Date:2019/3/29
 * Author:gyc
 * Desc:
 */
public class LazyTest1 {

    public static void main(String[] args) {
        method1();

    }

    public static void method1(){

        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());

        thread1.start();
        thread2.start();


        System.out.println("-----end-----");

    }
}
