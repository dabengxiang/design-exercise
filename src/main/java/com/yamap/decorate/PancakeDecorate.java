package com.yamap.decorate;

/**
 * Date:2019/4/6
 * Author:gyc
 * Desc:
 */
public abstract class PancakeDecorate extends Pancake {

    private Pancake pancake;


    public PancakeDecorate(Pancake pancake) {
        this.pancake = pancake;
    }


    @Override
    public String getMsg() {
        return pancake.getMsg();
    }


    @Override
    public double getPrice() {
        return pancake.getPrice();
    }
}
