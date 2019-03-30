package com.yamap.singleton.hungry;

/**
 * Date:2019/3/29
 * Author:gyc
 * Desc:
 */
public class HungrySingleton1 {

    private static  HungrySingleton1 INSTANCE = null;

    static {
            INSTANCE = new HungrySingleton1();
    }

    private HungrySingleton1(){};

    public static  HungrySingleton1 getInstance() {
        return INSTANCE;
    }
}
