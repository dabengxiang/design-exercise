package com.yamap.singleton.test;

import com.yamap.singleton.enume.EnumSingleton;
import com.yamap.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * Date:2019/3/29
 * Author:gyc
 * Desc:
 */
public class LazyInnerClassSingletonTest {



    public static void main(String[] args) throws Exception {
        Class clz = EnumSingleton.class;
        Constructor declaredConstructor = clz.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Object instance1 =  declaredConstructor.newInstance();
        Object instance2 = declaredConstructor.newInstance();

        System.out.println(instance1 == instance2);

    }


}
