package com.lemon.java.day11;

public class Student extends Person{
    String major;
    public Student(){

    }
    public Student(String major){
        this.major = major;
    }
    public void study(){
        System.out.println("专业是 " + major);
    }
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }
    public float lianxi(float ss){
        return ss;
    }
}
