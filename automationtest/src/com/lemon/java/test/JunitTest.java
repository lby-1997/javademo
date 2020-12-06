package com.lemon.java.test;

import org.junit.Test;
/*
包装类的使用：
1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
2.基本数据类型，包装类，String三者之间的相互转换
 */
public class JunitTest {
    //基本数据类型，包装类-->String类型
    @Test
    public void test4(){
        int num1 = 10;
        //方式1，连接运算
        String str1 = num1 +"";
    }
    @Test
    public void test3(){
        int num1 = 10;
        method(num1);
        //自动装箱：
        int num2 = 10;
        Integer in1 = num2;
        //自动装箱：基本数据类型-->包装类
        boolean b1 = true;
        Boolean b2 = b1;

        //自动拆箱:包装类--->基本数据类型
        System.out.println(in1.toString());
        int num3 = in1;//自动拆箱
    }
    public void method(Object obj){
        System.out.println("obj");
    }
    //包装类--->基本数据类型:调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int  i1 = in1.intValue();
        System.out.println(i1);
    }
    //基本数据类型--->包装类
    @Test
    public void test1(){
        int num1 = 10;
        Integer in1= new Integer(num1);
        System.out.println(in1.toString());
        Integer in3 = new Integer("123");
        System.out.println(in3.toString());
        // Integer in4 = new Integer("123tt");
        // System.out.println(in4.toString());java.lang.NumberFormatException: For input string: "123tt"
        Float f1 = new Float(12.3f);
        Float f2 = new Float("22.3");
        System.out.println(f1);
        System.out.println(f2);
        Boolean b1 = new Boolean("TRUE");
        System.out.println(b1);
        Order order = new Order();
        System.out.println(order.isMale);//没赋值，默认值false
        System.out.println(order.isFemale);
    }
    class Order{
        boolean isMale;
        Boolean isFemale;
    }
}
