package com.yamap.prototype.deep;

import java.util.Date;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class DeepTest {

    public static void main(String[] args)  {

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        JinGuBang jinGuBang = new JinGuBang();
        qiTianDaSheng.setJinGuBang(jinGuBang);
        qiTianDaSheng.setBrithday(new Date());
        qiTianDaSheng.setHeight(1);
        qiTianDaSheng.setWeight(2);

        QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();

        if(clone != qiTianDaSheng){
            if(clone.getJinGuBang() != qiTianDaSheng.getJinGuBang()){
                System.out.println("深克隆");
            }else{
                System.out.println("浅克隆");

            }
        }else if(clone == null)
        {
            System.out.println("克隆失败");

        }else {
            System.out.println("地址相同");
        }

    }
}
