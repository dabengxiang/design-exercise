package com.yamap.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:2019/4/4
 * Author:gyc
 * Desc:
 */
public class PayFactory {

    public static final  String ALIPAY = "alipay";
    public static final  String WECHATPAY = "wechatpay";
    public static final  String JDPAY = "jdpay";

    public static final String DEFAULT =  "default";

    private static Map<String,Payment> map = new HashMap<>();

    static {
        map.put(ALIPAY,new AliPay());
        map.put(JDPAY,new JdPay());
        map.put(WECHATPAY,new WechatPay());
        map.put(DEFAULT,map.get(WECHATPAY));
    }


    public static Payment getPayMent(String key){

        Payment payment = map.get(key);
        if(payment==null){
            return map.get(DEFAULT);
        }

        return payment;

    }

}
