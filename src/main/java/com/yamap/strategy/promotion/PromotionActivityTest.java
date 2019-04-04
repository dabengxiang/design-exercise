package com.yamap.strategy.promotion;

/**
 * Date:2019/4/4
 * Author:gyc
 * Desc:
 */
public class PromotionActivityTest {


    public static void main(String[] args){
        PromotionStrategy promotion = PromotionActivityFactory.getPromotion(PromotionName.CASH_BACK);
        promotion.doPromotion();

    }

}
