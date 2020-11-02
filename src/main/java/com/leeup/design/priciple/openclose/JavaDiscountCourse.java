package com.leeup.design.priciple.openclose;

/**
 * @ClassName JavaDiscountCourse
 * @Description T0DO
 * @Author clee
 * @Date 2020/7/8 21:31
 * @Version 1.0
 **/
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
