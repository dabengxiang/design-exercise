package com.yamap.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import sun.security.jca.GetInstance;

import java.lang.reflect.Method;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class CglibMeiPo implements MethodInterceptor {


    public Object getInstance(Class clz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        before();
        obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }


    private void before(){
        System.out.println("媒婆开始物色。。");
    }


    private void after(){
        System.out.println("开始交换联系方式");
    }

}
