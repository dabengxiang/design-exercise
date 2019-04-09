package com.yamap.decorate;

/**
 * Date:2019/4/6
 * Author:gyc
 * Desc:
 */
public class HamPancakeDecorate extends PancakeDecorate {
    public HamPancakeDecorate(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "加个火腿吧！";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
}
