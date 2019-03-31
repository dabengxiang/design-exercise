package com.yamap.delegate;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class Boss {

    public void command(String command, Leader leader){
        leader.doSomething(command);
    }
}
