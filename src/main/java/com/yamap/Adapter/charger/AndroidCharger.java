package com.yamap.Adapter.charger;

import com.yamap.Adapter.phone.AndroidPhone;
import com.yamap.Adapter.phone.Phone;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public class AndroidCharger implements Charger {

    @Override
    public boolean support(Phone phone) {
        return phone instanceof AndroidPhone;
    }

    @Override
    public void doSomeThing(Phone phone) {
        System.out.println("给安卓手机"+phone+"充电");
    }

}
