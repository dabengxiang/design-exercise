package com.yamap.Adapter.charger;

import com.yamap.Adapter.phone.Phone;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public class AppleCharger implements Charger {
    @Override
    public boolean support(Phone phone) {
        return false;
    }

    @Override
    public void doSomeThing(Phone phone) {

    }
}
