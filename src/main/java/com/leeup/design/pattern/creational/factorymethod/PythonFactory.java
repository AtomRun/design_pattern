package com.leeup.design.pattern.creational.factorymethod;

/**
 * @ClassName PythonFactory
 * @Description TODO
 * @Author clee
 * @Date 2020/11/5 21:12
 * @Version 1.0
 **/
public class PythonFactory extends VideoFactory{

    //具体生产什么什么视频交由子类实现决定
    public Video getVideo() {
        return new PythonVideo();
    }
}
