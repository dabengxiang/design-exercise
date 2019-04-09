package com.yamap.observer.pgeradvise;

/**
 * Created by Tom on 2019/3/17.
 */
public class Question {

    private String userName;
    private String content;
    private String form ;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getForm() {
        return form;
    }
}
