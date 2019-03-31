package com.yamap.proxy.dynamicproxy.myproxy;

import java.lang.reflect.Method;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
