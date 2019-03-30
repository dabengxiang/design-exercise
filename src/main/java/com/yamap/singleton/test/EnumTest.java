package com.yamap.singleton.test;

import com.yamap.singleton.container.ContainerSingleton;
import com.yamap.singleton.enume.EnumSingleton1;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class EnumTest {
    public static void main(String[] args){
        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object data = EnumSingleton1.getIntance().getData();
                    System.out.println(data);
                }
            }, 10,8);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
