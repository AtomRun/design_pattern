package com.leeup.design.pattern.creational.simplefactory;

/**
 * @ClassName Test
 * @Description TODO
 * @Author clee
 * @Date 2020/11/4 20:34
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {

        //v1
        ////调用类的client
        //Video video = new JavaVideo();//这种情况下，Video严重依赖Java这种具体的video
        //video.produce();

        //v2 直接依赖工厂
        //缺点，如果要增加功能，需要大量修改工厂，这样就不符合开闭原则
        //VideoFactory videoFactory = new VideoFactory();
        //Video video = videoFactory.getVideo("java");
        //if (video==null){
        //    return;
        //}
        //video.produce();

        //v3 使用反射的工厂
        //如果要添加类，我们只用放到工厂方法对应的Class就行，不用修改工厂方法
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video==null){
            return;
        }
        video.produce();
    }
}
