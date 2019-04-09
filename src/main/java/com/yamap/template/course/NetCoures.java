package com.yamap.template.course;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public abstract class NetCoures {


    public final void createCourse(){

        this.postPreResource();

        this.createPpt();

        this.liveVideo();

        this.postNote();

        this.postSource();

        if(this.needHomework()){
            this.checkHomework();
        }

    }

    protected abstract void checkHomework();

    protected abstract boolean needHomework();


    protected  void postSource(){
        System.out.println("发布源码");
    }


    protected  void postNote(){
        System.out.println("发布笔记");
    }

    protected  void liveVideo(){
        System.out.println("在线直播");
    }

    protected   void createPpt(){
        System.out.println("写ppt");
    }



    protected  void postPreResource(){
        System.out.println("发布预习资料！！");
    }


}
