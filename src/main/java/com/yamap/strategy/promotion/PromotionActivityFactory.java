package com.yamap.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class PromotionActivityFactory {

    private static Map<String,PromotionStrategy> map = new HashMap();


    static {
        map.put(PromotionName.CASH_BACK,new CashBackStrategy());
        map.put(PromotionName.GROUP_BUY,new GroupbuyStrategy());
        map.put(PromotionName.COUPON,new CouponStrategy());
        map.put(PromotionName.EMPTY,new EmptyStrategy());
        map.put(PromotionName.DEFAULT,map.get(PromotionName.EMPTY));
    }



    public static PromotionStrategy getPromotion(String name ){
        return map.getOrDefault(name,map.get(PromotionName.DEFAULT));
    }



}
