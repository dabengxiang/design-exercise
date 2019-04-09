package com.yamap.observer.guava.homework;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.yamap.observer.pgeradvise.GPer;
import com.yamap.observer.pgeradvise.Question;

/**
 * Date:2019/4/8
 * Author:gyc
 * Desc:
 */
public class GuavaTeacher {

    private String name ;

    public GuavaTeacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Subscribe
    public void update(  Question question) {
        System.out.println(this.name + "，您好");
        System.out.println("你收到一个来自"+question.getForm()+"，的一个问题。问题内容如下：");
        System.out.println(question.getContent());
        System.out.println("提问者：" + question.getUserName());
    }
}
