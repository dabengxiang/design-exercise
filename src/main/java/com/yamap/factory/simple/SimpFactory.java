package com.yamap.factory.simple;

import com.yamap.factory.product.Icourse;
import com.yamap.factory.product.JavaCourse;
import com.yamap.factory.product.PystonCourse;

/**
 * project name : design-project
 * Date:2019/3/26
 * Author: yc.guo
 * DESC:
 */
public class SimpFactory {
    
    
    // 这样的缺点，每增加一们课程都要在这里写一个if-else
    public Icourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("pyston".equals(name)){
            return new PystonCourse();
        }
        return null;
    }
    
    
    //升级版.这样写都知道clz是哪个了，感觉直接new出来就行了没什么意义
    public Icourse create(Class<? extends Icourse> clz){
     
        try {
            if(clz!= null ){
                return clz.newInstance();
            }  
        }catch (Exception e){
            System.err.println(e);
        }
        return null;

    }
    
    
    
}
