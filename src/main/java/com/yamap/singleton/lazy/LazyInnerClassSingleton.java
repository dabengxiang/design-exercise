package com.yamap.singleton.lazy;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * Date:2019/3/29
 * Author:gyc
 * Desc:
 */
public class LazyInnerClassSingleton {

    private  static  class LazyHolder{
        private static LazyInnerClassSingleton instance = new LazyInnerClassSingleton();

        static {
            System.out.println("LazyHolder 加载了");
        }


    }

    private LazyInnerClassSingleton(){
        if(LazyHolder.instance!=null){
            throw new RuntimeException("不允许创建多个实例！");
        }
    };

    static {
        System.out.println("LazyInnerClassSingleton 加载了");
    }

    public static LazyInnerClassSingleton getInstance(){
        return  LazyHolder.instance;
    }


}
