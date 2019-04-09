package com.yamap.observer.pgeradvise;

import java.util.Observable;
import java.util.Observer;

/**  观察者
 * Date:2019/4/8
 * Author:gyc
 * Desc:
 */
public class GPer extends Observable {

    private String name = "gp生态区";

    private static GPer instance = null;


    private GPer(){}

    public static GPer getInstance(){
        if(instance == null ){
            instance = new GPer();
        }
        return instance;
    }


    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "提交了一个问题");
        setChanged();
        notifyObservers(question);      //这里带的这个参数就是teacher类里update中的arg

    }

    public String getName() {
        return name;
    }
}
