package com.leeup.design.priciple.openclose;

/**
 * @ClassName Test
 * @Description TODO
 * @Author cLee
 * @Date{2020/3/16}
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        // 接口引用指向实现类的对象
        ICourse ICourse = new JavaDiscountCourse(96,"java电商开发",348d);
        //获取原价
        //因为是父类声明的引用，所以无法获取子类的获取原价的方法，我们使用强转的方式
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)ICourse;
        System.out.println("课程ID"+javaCourse.getId()+"课程名称"+javaCourse.getName()+"课程原价格"+javaCourse.getOriginPrice()+"课程价格"+javaCourse.getPrice());
    }
}
