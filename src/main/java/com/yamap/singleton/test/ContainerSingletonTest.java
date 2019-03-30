package com.yamap.singleton.test;

import com.yamap.singleton.container.ContainerSingleton;

/**
 * Date:2019/3/30
 * Author:gyc
 * Desc:
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {


        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getInstance("com.yamap.singleton.test.pojo");;
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 10,8);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
