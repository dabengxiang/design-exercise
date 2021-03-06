package com.yamap.proxy.dynamicproxy.myproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class MyMeipoProxy implements MyInvocationHandler {


    private Object target ;


    public  Object getInstance(Object target){
        this.target = target;
        Class<?> clz = target.getClass();
        return  MyProxy.newProxyInstance(new MyClassLoader(),clz.getInterfaces(),this);

    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }


    private void before(){
        System.out.println("媒婆开始物色。。");
    }


    private void after(){
        System.out.println("开始交换联系方式");
    }
}
