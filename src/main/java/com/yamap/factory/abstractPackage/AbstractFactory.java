package com.yamap.factory.abstractPackage;



/**
 * project name : design-project
 * Date:2019/3/26
 * Author: yc.guo
 * DESC:
 */
public abstract  class AbstractFactory {
    
    abstract  INode createNode();
    
    abstract  IVideo createVideo();
    
     void study(){
        createNode().node();
        createVideo().video();
    }
    
    
}
