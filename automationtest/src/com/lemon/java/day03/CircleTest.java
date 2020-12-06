package com.lemon.java.day03;
//设计类Circle计算圆得面积
//测试类
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2.1;
        //方式一
        // double area = c1.fingArea();
        // System.out.println(area);
        //方式二
        c1.findArea();
    }
}

class Circle{
    //属性
    double radius;

    //求圆得面积
    //方式一：
    // public double fingArea() {
    //
    //     double area = Math.PI * radius * radius;
    //     return area;
    // }
    public void findArea(){
        double area = Math.PI * radius * radius;
        System.out.println("面积为: "+ area);
    }


}

