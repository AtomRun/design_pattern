package com.leeup.design.pattern.creational.factorymethod;

/**
 * @ClassName Test
 * @Description TODO
 * @Author clee
 * @Date 2020/11/4 20:34
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {

        //v1 如果简单工厂方法，想要加一个新的视频，必须要在factory中
        VideoFactory videoFactory = new JavaFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }
}
