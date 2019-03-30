package com.yamap.prototype.simple;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
@Data
public class ProtoTypeA implements Cloneable{

    private String name;

    private int age;

    private ArrayList<String> Hobby;


    @Override
    protected Object clone()  {
       return  deepClone();
    }


    private  Object simpleClone(){
        try {
            return super.clone();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    private Object deepClone(){
        try {
            ProtoTypeA clone = (ProtoTypeA) super.clone();
            clone.setHobby(new ArrayList<String>(clone.getHobby()));
            return clone;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
