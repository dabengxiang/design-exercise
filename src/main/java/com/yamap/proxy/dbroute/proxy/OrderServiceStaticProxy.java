package com.yamap.proxy.dbroute.proxy;

import com.yamap.proxy.dbroute.IOrderService;
import com.yamap.proxy.dbroute.Order;
import com.yamap.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class OrderServiceStaticProxy implements IOrderService {

    private IOrderService orderService;

    private static final DateFormat df = new SimpleDateFormat("yyyy");

    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService = orderService;
    }


    public int createOrder(Order order) {
        int year ;
        if(order.getCreateTime() == null){
            year = Integer.parseInt(df.format(new Date()));
            order.setCreateTime(System.currentTimeMillis());
        }else{
            year = Integer.parseInt(df.format(new Date(order.getCreateTime())));
        }
        System.out.println("静态代理类自动分配到【DB_" +  year + "】数据源处理数据" );
        DynamicDataSourceEntity.set(year);
        orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return 0;
    }
}
