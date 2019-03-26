package com.yamap.factory.abstractPackage;

/**
 * project name : design-project
 * Date:2019/3/26
 * Author: yc.guo
 * DESC:
 */
public class PystonFactory extends AbstractFactory {
    public INode createNode() {
        return new PystonNode();
    }

    public IVideo createVideo() {
        return new PysthonVideo();
    }
}
