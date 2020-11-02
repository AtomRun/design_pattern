package com.leeup.design.priciple.dependeceinversion;

/**
 * @ClassName FECourse
 * @Description TODO
 * @Author clee
 * @Date 2020/11/2 20:58
 * @Version 1.0
 **/
public class FECourse implements ICourse {

    public void studyCourse() {
        System.out.println("学习前端课程");
    }
}
