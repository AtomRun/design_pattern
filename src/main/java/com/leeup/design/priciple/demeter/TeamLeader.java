package com.leeup.design.priciple.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TeamLeader
 * @Description TODO
 * @Author clee
 * @Date 2020/11/3 20:09
 * @Version 1.0
 **/
public class TeamLeader {

    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20 ; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是"+courseList.size());
    }
}
