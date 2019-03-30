package com.yamap.prototype.deep;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.Date;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class QiTianDaSheng extends Monkey implements Cloneable {


    private JinGuBang jinGuBang;

    @Override
    protected Object clone() {
        return deepClone();
    }

    private Object simpleClone(){
        try {
            return super.clone();
        }catch (Exception e){
            e.printStackTrace();
            return null;

        }
    }


    private Object deepClone(){
        try {
            QiTianDaSheng clone = (QiTianDaSheng) super.clone();

            ByteArrayOutputStream   bos = new ByteArrayOutputStream();
            ObjectOutputStream ops = new ObjectOutputStream(bos);
            ops.writeObject(this.getJinGuBang());
            ops.flush();
            ops.close();

            ByteArrayInputStream  bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            JinGuBang jinGuBang = (JinGuBang) ois.readObject();

            clone.setJinGuBang(jinGuBang);
            clone.setBrithday(new Date());

            return clone;


        }catch (Exception e){
            e.printStackTrace();
            return null;

        }
    }

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }
}
