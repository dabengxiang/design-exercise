package com.yamap.decorate;

/**
 * Date:2019/4/6
 * Author:gyc
 * Desc:
 */
public class EggPancakeDecorate extends PancakeDecorate {


    public EggPancakeDecorate(Pancake pancake) {
        super(pancake);
    }


    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }


    @Override
    public String getMsg() {
        return super.getMsg()+"加个鸡蛋吧！";
    }
}
