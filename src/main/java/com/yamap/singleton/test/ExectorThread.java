package com.yamap.singleton.test;

import com.yamap.singleton.container.ThreadLocalSingleton;
import com.yamap.singleton.lazy.LazyInnerClassSingleton;
import com.yamap.singleton.lazy.LazySingleton;

/**
 * Date:2019/3/29
 * Author:gyc
 * Desc:
 */
public class ExectorThread implements  Runnable {

    public void run() {
        //这个不成功，线程不安全
//        LazySingleton instance1 = LazySingleton.getInstance1();
//        System.out.println(Thread.currentThread()+instance1.toString());


        //这个不成功，线程安全
//        LazySingleton instance2 = LazySingleton.getInstance2();
//        System.out.println(Thread.currentThread()+instance2.toString());


//        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
//         System.out.println(Thread.currentThread()+lazyInnerClassSingleton.toString());


        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread()+threadLocalSingleton.toString());

    }
}
