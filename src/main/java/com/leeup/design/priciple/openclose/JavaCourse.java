package com.leeup.design.priciple.openclose;

/**
 * @ClassName JavaCourse
 * @Description TODO
 * @Author cLee
 * @Date{2020/3/16}
 * @Version 1.0
 **/
public class JavaCourse implements ICourse{

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

//    public Double getDisCountPrice() {
//        return this.price * 0.8;
//    }
}
