package com.yamap.strategy.pay;

import com.yamap.strategy.pay.payport.PayFactory;

/**
 * Date:2019/4/4
 * Author:gyc
 * Desc:
 */
public class PayTest {

    public static void main(String[] args){

        Order order = new Order("101","2222000001",299);
        MsgResult msgResult = order.pay(PayFactory.ALIPAY);
        System.out.println(msgResult);


    }
}
