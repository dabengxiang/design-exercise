package com.yamap.observer.events;

/**
 * Date:2019/4/8
 * Author:gyc
 * Desc:
 */
public class MouseTest {

    public static void main(String[] args){

        Mouse mouse = new Mouse();
        MouseEventCallback target = new MouseEventCallback();

        mouse.addLisenter(MouseEventType.ON_CLICK,target);


        mouse.click();

    }
}
