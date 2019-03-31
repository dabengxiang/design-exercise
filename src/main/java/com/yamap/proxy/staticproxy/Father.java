package com.yamap.proxy.staticproxy;

import com.yamap.proxy.Person;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class Father implements Person {

    private Son son;

    public Father(Son son){
        this.son = son;

    }

    public void findLove() {
        System.out.println("开始检查物色");
        System.out.println("找到目标");
        son.findLove();
        System.out.println("双方见面。。。");
    }
}
