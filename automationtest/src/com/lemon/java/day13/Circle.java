package com.lemon.java.day13;

public class Circle {
    public static void main(String[] args) {
        CircleTest c1 = new CircleTest();
        CircleTest c2 = new CircleTest();
        CircleTest c3 = new CircleTest();
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println(CircleTest.getTotal());
    }
}
class CircleTest{
    private double radius;
    private int id;


    public CircleTest(){
        id = init++;
        total++;
    }
    public CircleTest(double radius){
        this();
        this.radius = radius;

    }
    public static int getTotal() {
        return total;
    }

    private static int total;//记录创建的圆的个数
    private static int init = 1001;//static声明的属性被所有对象共享
    public double findArea(){
        return 3.14 * radius * radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }
}
