package com.yamap.strategy.pay.payport;

/**
 * Date:2019/4/4
 * Author:gyc
 * Desc:
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {

        return "微信";
    }

    @Override
    public double queryBalance(String uid) {
        return 1000;
    }
}
