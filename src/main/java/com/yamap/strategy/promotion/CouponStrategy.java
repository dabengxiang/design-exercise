package com.yamap.strategy.promotion;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class CouponStrategy implements  PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券购买更便宜。。");
    }
}
