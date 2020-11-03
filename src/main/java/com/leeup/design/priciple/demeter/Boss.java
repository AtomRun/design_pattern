package com.leeup.design.priciple.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Boss
 * @Description TODO
 * @Author clee
 * @Date 2020/11/3 20:08
 * @Version 1.0
 **/
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
