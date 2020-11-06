package com.leeup.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonCourseFactory
 * @Description TODO
 * @Author clee
 * @Date 2020/11/6 21:21
 * @Version 1.0
 **/
public class PythonCourseFactory implements CourseFactory{

    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new  JavaArticle();
    }
}
