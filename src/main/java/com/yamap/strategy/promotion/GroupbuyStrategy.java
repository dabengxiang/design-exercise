package com.yamap.strategy.promotion;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团购买更便宜。。");
    }
}
