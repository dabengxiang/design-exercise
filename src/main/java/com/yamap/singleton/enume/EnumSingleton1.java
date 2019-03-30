package com.yamap.singleton.enume;

import com.yamap.singleton.test.pojo;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public enum EnumSingleton1 {
    INTANCE;


    private static Object data = new pojo();


    public Object getData() {
        return data;
    }


    public static EnumSingleton1 getIntance(){
        return INTANCE;
    }
}
