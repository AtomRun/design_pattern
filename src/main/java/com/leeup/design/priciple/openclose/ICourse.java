package com.leeup.design.priciple.openclose;

/**
 * @InterfaceName ICourse
 * @Description 开闭原则
 * @Author cLee
 * @Date{2020/3/16}
 * @Version 1.0
 **/

/**
 * 用抽象构建框架，用实现扩展细节
 * 优点：提高软件的可维护性可复用性
 * 面向抽象编程，而不是面向模块编程
 */
public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();
//    Double getDisCountPrice();
}
