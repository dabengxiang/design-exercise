package com.yamap.strategy.pay;

/**
 * Date:2019/4/4
 * Author:gyc
 * Desc:
 */
public class MsgResult {

   private String code;
   private Object data;
   private String msg;

    public MsgResult(String code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "支付状态:【"+code+"】,"+msg+",交易详情："+data;
    }
}
