package com.leeup.design.priciple.singleresponsibility;

/**
 * @ClassName Test
 * @Description TODO
 * @Author clee
 * @Date 2020/11/2 21:54
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {

        //v1
        //Bird bird = new Bird();
        //bird.mainMoveMode("大雁");
        //bird.mainMoveMode("鸵鸟");//不正确

        //v2
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
