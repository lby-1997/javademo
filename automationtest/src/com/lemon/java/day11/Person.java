package com.lemon.java.day11;

public class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(int distan){
        System.out.println("走路，走的距离是： " + distan + "公里");
    }
    public double lianxi(double ss){
        return ss;
    }
}
