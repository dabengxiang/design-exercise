package com.yamap.strategy.pay.payport;

/**
 * Date:2019/4/4
 * Author:gyc
 * Desc:
 */
public class AliPay extends  Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 100;
    }
}
