package com.yamap.singleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class ContainerSingleton {

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();


    public static Object getInstance(String className){
        synchronized (ioc){
        if(!ioc.containsKey(className)){

                try {
                    Object o = Class.forName(className).newInstance();
                    ioc.put(className,o);
                    return ioc;
                }catch ( Exception e){
                    e.printStackTrace();
                }
        }
        }
        return ioc.get(className);

    }



}
