package com.lemon.java1;

import java.util.Scanner;

public class Calculator {
    //加
    double add(double a,double b){
        return a+b;
    }

    //减
    public double division(double a,double b){
        return a/b;
    }

    //乘
    public double substract(double a,double b){
        return a-b;
    }

    //除
    public double multiply(double a,double b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        double a = scan.nextDouble();
        //输入运算符
        String operator = scan.next();
        System.out.println("输入第二个数字： ");
        double b = scan.nextDouble();
        Calculator calculator = new Calculator();
        double result = 0;
        if("+".equals(operator)){
            //完成加法运算
            result = calculator.add(a,b);
        }
        if("-".equals(operator)){
            //完成减法运算
            result = calculator.division(a,b);
        }
        if("*".equals(operator)){
            //完成乘法运算
            result = calculator.multiply(a,b);
        }
        if("/".equals(operator)){
            //完成除法运算
            result = calculator.substract(a,b);
        }
        System.out.println("结果为： " + result);
    }
}
