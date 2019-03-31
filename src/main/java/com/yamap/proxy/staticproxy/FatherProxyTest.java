package com.yamap.proxy.staticproxy;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class FatherProxyTest {

    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father(son);
        father.findLove();

    }
}
