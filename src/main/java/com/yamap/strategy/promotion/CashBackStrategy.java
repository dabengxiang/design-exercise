package com.yamap.strategy.promotion;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class CashBackStrategy implements  PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减活动，满3000返还1000");
    }
}
