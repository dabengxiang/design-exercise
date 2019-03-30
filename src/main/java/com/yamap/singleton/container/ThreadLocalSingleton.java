package com.yamap.singleton.container;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class ThreadLocalSingleton {

    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>(){

        @Override
        protected ThreadLocalSingleton initialValue() {
           return  new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}


    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }


}
