package com.yamap.singleton.hungry;

/**
 * Date:2019/3/28
 * Author:gyc
 * Desc:
 */

//饿汉式
public class HungrySingleton {


    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){};

    public static  HungrySingleton getInstance() {
        return INSTANCE;
    }
}
