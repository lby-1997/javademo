package com.lemon.java.day09.aiguigu.exer;
/*
编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明司有得底边长base和高height，同时声明公共方法访问司有变量。
此外，提供必要得构造器。另一个类中使用这些公共方法，计算三角形得面积
 */
public class TriAngle {
    private double base;
    private double height;

    public TriAngle(){

    }
    public TriAngle(double b,double h){
        base = b;
        height = h;

    }    public void setBase(double b){
        base = b;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getHeight(){
        return height;
    }
}
