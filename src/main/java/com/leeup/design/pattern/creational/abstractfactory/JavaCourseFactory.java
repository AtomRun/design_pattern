package com.leeup.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaCourseFactory
 * @Description TODO
 * @Author clee
 * @Date 2020/11/6 21:16
 * @Version 1.0
 **/
public class JavaCourseFactory implements CourseFactory{

    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new  JavaArticle();
    }
}
