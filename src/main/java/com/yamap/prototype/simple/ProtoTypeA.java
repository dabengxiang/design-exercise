package com.yamap.prototype.simple;


import java.util.ArrayList;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getHobby() {
        return Hobby;
    }

    public void setHobby(ArrayList<String> hobby) {
        Hobby = hobby;
    }
}
