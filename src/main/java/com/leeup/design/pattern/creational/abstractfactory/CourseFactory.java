package com.leeup.design.pattern.creational.abstractfactory;

/**
 * @ClassName CourseFactory
 * @Description TODO
 * @Author clee
 * @Date 2020/11/6 21:14
 * @Version 1.0
 **/
public interface CourseFactory {

    Video getVideo();

    Article getArticle();
}
