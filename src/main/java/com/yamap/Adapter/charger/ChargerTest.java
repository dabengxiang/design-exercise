package com.yamap.Adapter.charger;

import com.yamap.Adapter.phone.AndroidPhone;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public class ChargerTest {

    public static void main(String[] args){

        AndroidPhone androidPhone = new AndroidPhone();
        ChargerFactory.charge(androidPhone);

    }
}
