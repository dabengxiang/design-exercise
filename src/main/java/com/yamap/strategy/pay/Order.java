package com.yamap.strategy.pay;

import com.yamap.strategy.pay.payport.PayFactory;

/**
 * Date:2019/4/4
 * Author:gyc
 * Desc:
 */
public class Order {

    private String uid;

    private String orderId;

    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }


    public MsgResult pay(){
        return PayFactory.getPayMent(PayFactory.DEFAULT).pay(uid,amount);
    }

    public MsgResult pay(String payName){
        return PayFactory.getPayMent(payName).pay(uid,amount);
    }
}
