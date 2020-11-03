package com.leeup.design.priciple.interfacesegregation;

/**
 * @ClassName IAnimalAction
 * @Description 接口隔离原则，主要对接口尽量隔离，但是要适度，接口可以小，但是不能太小，那样太多了。
 * 接口是约定的契约，在本例子，三个行为抽象为三个接口。
 * @Author clee
 * @Date 2020/11/3 20:02
 * @Version 1.0
 **/
public interface IAnimalAction {

    public void eat();
    public void fly();
    public void swim();
}
