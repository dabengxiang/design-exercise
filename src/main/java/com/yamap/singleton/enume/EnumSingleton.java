package com.yamap.singleton.enume;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public enum EnumSingleton  {

    INTANCE;


    private Object data ;


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getIntance(){
        return INTANCE;
    }
}
