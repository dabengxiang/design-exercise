package com.yamap.Adapter.loginadapter.v2.adapters;


import com.yamap.Adapter.loginadapter.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
