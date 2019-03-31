package com.yamap.delegate;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class DelegateTest
{
    public static void main(String[] args) {

        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.command("登录", leader);


    }
}
