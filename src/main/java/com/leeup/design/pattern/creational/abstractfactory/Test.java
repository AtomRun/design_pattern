package com.leeup.design.pattern.creational.abstractfactory;

/**
 * @ClassName Test
 * @Description TODO
 * @Author clee
 * @Date 2020/11/6 21:24
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = new JavaVideo();
        Article article = new JavaArticle();
        video.produce();
        article.produce();
    }
}
