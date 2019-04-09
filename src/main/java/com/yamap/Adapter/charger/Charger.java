package com.yamap.Adapter.charger;

import com.yamap.Adapter.phone.Phone;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public interface Charger {

    boolean support(Phone phone);

    void doSomeThing(Phone phone);

}
