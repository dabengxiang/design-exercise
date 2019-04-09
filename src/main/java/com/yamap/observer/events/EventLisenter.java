package com.yamap.observer.events;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Date:2019/4/8
 * Author:gyc
 * Desc:
 */
public class EventLisenter  {

    private static Map<String,Event> events = new HashMap<>();

    public void addLisenter(String eventType, Object target){

        try {
            this.addLisenter(eventType,target,target.getClass().getMethod("on"+toUpperStr(eventType),Event.class));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addLisenter(String eventType, Object target,Method callback){
        events.put(eventType,new Event(target,callback));

    }



    public void trigger(String eventType){
        Event event = events.get(eventType);
        if(event!=null){
            trigger(event);
        }

    }


    public void trigger(Event event){

        event.setSourse(this);
        event.setTime(System.currentTimeMillis());
        Method callback = event.getCallback();
        callback.setAccessible(true);
        try {
            callback.invoke(event.getTarget(),event);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }




    private String toUpperStr(String str){
        char[] chars = str.toCharArray();
        chars[0] =  Character.toUpperCase(chars[0]);
        return new String(chars);

    }


}
