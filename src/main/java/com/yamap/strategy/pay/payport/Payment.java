package com.yamap.strategy.pay.payport;

import com.yamap.strategy.pay.MsgResult;

/**
 * Date:2019/4/4
 * Author:gyc
 * Desc:
 */
public abstract  class Payment {

    public abstract String getName();

    public abstract  double queryBalance(String uid);

    public MsgResult pay(String uid, double amount){
        if(queryBalance(uid) < amount){
            return new MsgResult("500","支付失败","余额不足");
        }else{
            return new MsgResult("200","支付成功",getName()+"支付了:"+ amount);
        }

    }


}
