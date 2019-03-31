package com.yamap.proxy.dbroute;

import com.yamap.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class OrderServiceTest {

    public static void main(String[] args) {

        Order order = new Order();
        order.setId("1");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date parse = null;
        try {
             parse = simpleDateFormat.parse("2007/06/03");
        } catch (ParseException e) {


        }
        order.setCreateTime(parse.getTime());

        OrderService orderService = new OrderService();
        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy(orderService);
        proxy.createOrder(order);

    }
}
