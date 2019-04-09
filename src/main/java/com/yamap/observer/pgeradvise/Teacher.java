package com.yamap.observer.pgeradvise;

import java.util.Observable;
import java.util.Observer;

/**
 * Date:2019/4/8
 * Author:gyc
 * Desc:
 */
public class Teacher implements Observer {

    private String name ;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;
        System.out.println(this.name + "，您好");
        System.out.println("你收到一个来自"+gPer.getName()+"，的一个问题。问题内容如下：");
        System.out.println(question.getContent());
        System.out.println("提问者：" + question.getUserName());
    }
}
