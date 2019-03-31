package com.yamap.strategy.promotion;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("不做活动，不减");
    }
}
