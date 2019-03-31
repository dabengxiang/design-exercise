package com.yamap.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class CglibTest {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"F://refect_file/");

        CglibMeiPo cglibMeiPo = new CglibMeiPo();
        Customer instance = (Customer) cglibMeiPo.getInstance(Customer.class);
        instance.findLove();




    }
}
