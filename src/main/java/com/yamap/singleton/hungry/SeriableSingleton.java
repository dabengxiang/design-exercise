package com.yamap.singleton.hungry;

import java.io.Serializable;
import java.time.Instant;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class SeriableSingleton implements Serializable{

    private static final SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){};

    public static  SeriableSingleton getInstance() {
        return INSTANCE;
    }

    public Object readResolve(){
        return INSTANCE;
    }
}
