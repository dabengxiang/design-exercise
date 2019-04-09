package com.yamap.observer.events;

import java.lang.reflect.Method;

/**
 * Date:2019/4/8
 * Author:gyc
 * Desc:
 */
public class Event {

    private Object sourse;

    private Object target;

    private Method callback;

    private String trigger;

    private Long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSourse() {
        return sourse;
    }

    public void setSourse(Object sourse) {
        this.sourse = sourse;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
