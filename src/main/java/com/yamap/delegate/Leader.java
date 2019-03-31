package com.yamap.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:2019/3/31
 * Author:gyc
 * Desc:
 */
public class Leader implements  IEmployee {

    private static Map<String ,IEmployee> map = new HashMap<String, IEmployee>();

    static {
        map.put("加密",new EmployeeA());
        map.put("登录",new EmployeeB());
    }


    @Override
    public void doSomething(String command) {
        map.get(command).doSomething(command);
    }
}
