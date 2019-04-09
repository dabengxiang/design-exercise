package com.yamap.observer.guava.homework;

import com.yamap.observer.pgeradvise.Question;

/**
 * Date:2019/4/9
 * Author:gyc
 * Desc:
 */
public class GuavaGperTest {

    public static void main(String[] args) {
        GuavaGper instance = GuavaGper.getInstance();
        GuavaTeacher tom = new GuavaTeacher("tom");
        Question question = new Question();
        question.setUserName("张三");
        question.setContent("linux 学习");
        instance.register(tom);
        instance.publishQuestion(question);

    }
}
