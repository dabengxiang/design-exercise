package com.yamap.Adapter.charger;

import com.yamap.Adapter.phone.Phone;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public class ChargerFactory {

    public static final List<Charger> list = new ArrayList();

    static {
        list.add(new AppleCharger());
        list.add(new AndroidCharger());
    }


    public static  void charge(Phone phone){
        for (Charger charger : list) {
            if(charger.support(phone)){
                charger.doSomeThing(phone);
            }
        }

    }

}
