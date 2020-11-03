package com.leeup.design.priciple.demeter;

/**
 * @ClassName Test
 * @Description TODO
 * @Author clee
 * @Date 2020/11/3 20:16
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
