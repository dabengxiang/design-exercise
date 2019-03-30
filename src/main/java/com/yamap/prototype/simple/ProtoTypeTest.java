package com.yamap.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class ProtoTypeTest {

    public static void main(String[] args) {
        ProtoTypeA protoTypeA = new ProtoTypeA();
        ArrayList<String> list = new ArrayList();
        list.add("打篮球");
        list.add("踢足球");
        protoTypeA.setName("张三");
        protoTypeA.setAge(19);
        protoTypeA.setHobby(list);
        ProtoTypeA clone = (ProtoTypeA) protoTypeA.clone();
        System.out.println(clone == protoTypeA);
        System.out.println(clone.getHobby() == protoTypeA.getHobby());

    }
}
