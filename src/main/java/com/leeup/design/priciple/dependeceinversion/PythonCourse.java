package com.leeup.design.priciple.dependeceinversion;

/**
 * @ClassName PythonCourse
 * @Description TODO
 * @Author clee
 * @Date 2020/11/2 20:59
 * @Version 1.0
 **/
public class PythonCourse implements ICourse{

    public void studyCourse() {
        System.out.println("学习Python课程");
    }
}
