package com.leeup.design.priciple.dependeceinversion;

/**
 * @ClassName JavaCourse
 * @Description TODO
 * @Author clee
 * @Date 2020/11/2 20:57
 * @Version 1.0
 **/
public class JavaCourse implements ICourse{

    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
