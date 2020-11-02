package com.leeup.design.priciple.dependeceinversion;

/**
 * @ClassName ICourse
 * @Description TODO
 * @Author clee
 * @Date 2020/11/2 20:57
 * @Version 1.0
 **/
public interface ICourse {

    //具体学习什么课程，交给高层来选择
    void studyCourse();
}
