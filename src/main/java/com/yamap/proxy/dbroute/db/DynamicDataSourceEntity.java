package com.yamap.proxy.dbroute.db;

import sun.security.jca.GetInstance;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class DynamicDataSourceEntity {

    private static final String DEFAULT_SCOURCE = null;

    private static final ThreadLocal<String> INTANCE = new ThreadLocal<String>();

    private DynamicDataSourceEntity(){}


    public static String get(){
        return INTANCE.get();
    }

    public static void set(String dbName){
        INTANCE.set(dbName);

    }

    public static void set(int year){
        INTANCE.set("DB_" + year);
    }


    public static  void restore(){
        INTANCE.set(DEFAULT_SCOURCE);
    }




}
