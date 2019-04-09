package com.yamap.decorate;

/**
 * Date:2019/4/6
 * Author:gyc
 * Desc:
 */
public class DecorateTest {

    public static void main(String[] args) {

        Pancake pancake = new Pancake();

        pancake = new EggPancakeDecorate(pancake);
        pancake = new EggPancakeDecorate(pancake);
        pancake = new HamPancakeDecorate(pancake);

        System.out.println(pancake.getPrice());
        System.out.println(pancake.getMsg());

    }
}
