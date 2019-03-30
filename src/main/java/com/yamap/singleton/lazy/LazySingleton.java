package com.yamap.singleton.lazy;

/**
 * Date:2019/3/28
 * Author:gyc
 * Desc:
 */
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton instance;


    //线程安全问题 当两个线程同时进入if语句，就会生成两个对象了
    public static LazySingleton getInstance1(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }


    //这样子每次获取对象时都要加锁，这样会影响效率
    public synchronized static LazySingleton getInstance2() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }


    //双重判断，第一个判断主要是排除日常的获取实例，如果已经有实例了可以直接返回了也不用经过下面的加锁去新建对象，对效率没太大影响
    // 第二个判断是因为我已经加了锁了，其他人肯定要等我操作完再去读取第二个操作，所以就可以保证了脏读的可能性了
    public  static LazySingleton getInstance3() {
        if(instance == null){
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


}
