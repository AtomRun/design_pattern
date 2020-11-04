package com.leeup.design.pattern.creational.simplefactory;

/**
 * @ClassName VideoFactory
 * @Description TODO
 * @Author clee
 * @Date 2020/11/4 20:46
 * @Version 1.0
 **/
public class VideoFactory {


    public Video getVideo(Class clazz){
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return video;
    }

    //v2版本，不够灵活，假设我们还有其他课程就需要修改工厂
    //public Video getVideo(String type){
    //    if (type.equalsIgnoreCase("java")){
    //        return new JavaVideo();
    //    } else {
    //        return new PythonVideo();
    //    }
    //}
}
