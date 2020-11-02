package com.leeup.design.priciple.dependeceinversion;

/**
 * @ClassName Test
 * @Description 依赖倒置原则
 * @Author clee
 * @Date 2020/11/2 20:50
 * @Version 1.0
 **/

/**
 * 高层模块不应该依赖低层模块，二者都应该依赖其抽象
 * 抽象不应该依赖细节，细节应该依赖抽象
 * 针对接口编程，不要针对实现编程
 * 优点：可以减少类之间的耦合性，提高系统稳定性，提高代码可读性可维护性，降低修改程序造成的危险。
 */
public class CLee {

    private ICourse iCourse;


    public CLee() {
    }

    public CLee(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    //public void studyImoocCourse(ICourse course){
    //    //具体的实现类交给高层模块，而不是交给cLee
    //    course.studyCourse();
    //}

    //public void studyJavaCourse(){
    //    System.out.println("cLee在学习JavaCourse");
    //}
    //
    //public void studyFrontCourse(){
    //    System.out.println("cLee在学习FrontCourse");
    //}
}
