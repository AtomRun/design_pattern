package com.leeup.design.pattern.creational.factorymethod;

/**
 * @ClassName JavaVideoFactory
 * @Description TODO
 * @Author clee
 * @Date 2020/11/5 21:11
 * @Version 1.0
 **/
public class JavaFactory extends VideoFactory{

    public Video getVideo() {
        return new JavaVideo();
    }
}
