package com.yamap.observer.pgeradvise;

/**
 * Date:2019/4/8
 * Author:gyc
 * Desc:
 */
public class ObserverTest  {

    public static void main(String[] args) {

        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("tom");

        gPer.addObserver(tom);
        Question question = new Question();
        question.setUserName("jack");
        question.setContent("spring 源码剖析");
        gPer.publishQuestion(question);
    }
}
