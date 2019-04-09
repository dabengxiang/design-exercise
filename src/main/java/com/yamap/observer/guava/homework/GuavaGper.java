package com.yamap.observer.guava.homework;

import com.google.common.eventbus.EventBus;
import com.yamap.observer.pgeradvise.GPer;
import com.yamap.observer.pgeradvise.Question;

/**
 * Date:2019/4/8
 * Author:gyc
 * Desc:
 */
public class GuavaGper {

    private String name = "gp生态区";

    private EventBus eventBus ;


    private static GuavaGper instance = null;


    private GuavaGper(EventBus eventBus){
        this.eventBus = eventBus;
    }

    public static GuavaGper getInstance(){
        if(instance == null ){
            instance = new GuavaGper(new EventBus());
        }
        return instance;
    }


    public String getName() {
        return name;
    }

    public void register(Object o){
        eventBus.register(o);
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "提交了一个问题");
        question.setForm(this.name);
        eventBus.post(question);

    }


}
