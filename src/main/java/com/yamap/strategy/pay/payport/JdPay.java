package com.yamap.strategy.pay.payport;

/**
 * Date:2019/4/4
 * Author:gyc
 * Desc:
 */
public class JdPay extends  Payment {
    @Override
    public String getName() {
        return "京东";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
