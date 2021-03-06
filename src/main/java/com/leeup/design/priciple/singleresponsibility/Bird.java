package com.leeup.design.priciple.singleresponsibility;

/**
 * @ClassName Single
 * @Description TODO
 * @Author clee
 * @Date 2020/11/2 21:53
 * @Version 1.0
 **/

/**
 * 定义∶不要存在多于一个导致类变更的原因 一个类/接口/方法只负责一项职责
 * 优点︰降低类的复杂度、提高类的可读性，
 * 提高系统的可维护性、降低变更引起的风险
 */
public class Bird {

    public void mainMoveMode(String birdName){
        if (birdName.equals("鸵鸟")){
            System.out.println(birdName+"用脚走");
        }else {
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
