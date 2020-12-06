package com.lemon.java.day06;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);//输入a=100,b=200
        System.out.println(a);
        System.out.println(b);
    }
    public static void  method(int a, int b){
        a = a*10;
        b = b*20;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);
    }
}
