package com.leeup.design.priciple.dependeceinversion;

/**
 * @ClassName Test
 * @Description TODO
 * @Author clee
 * @Date 2020/11/2 20:53
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        //v1
        //CLee cLee = new CLee();
        //cLee.studyFrontCourse();
        //cLee.studyJavaCourse();
        //假设我们还学习Python课程，我们还要去用户类中添加，这就是面向实现编程了
        //实现类需要经常修改，扩展性很差，目前Test类是高层，依赖Clee模块，根据依赖倒置原则
        //高层次模块不应该依赖低层次的模块，Test依赖具体的CLee。修改功能必须要扩展CLee，我们引用抽象试试

        //v2
        //CLee cLee = new CLee();
        //cLee.studyImoocCourse(new JavaCourse());
        //cLee.studyImoocCourse(new FECourse());
        //cLee.studyImoocCourse(new PythonCourse());

        //v3 依赖构造对象
        //CLee cLee = new CLee(new JavaCourse());
        //cLee.studyImoocCourse();

        //v4
        CLee cLee = new CLee();
        cLee.setiCourse(new JavaCourse());
        cLee.studyImoocCourse();

        cLee.setiCourse(new FECourse());
        cLee.studyImoocCourse();

        cLee.setiCourse(new PythonCourse());
        cLee.studyImoocCourse();
    }
}
