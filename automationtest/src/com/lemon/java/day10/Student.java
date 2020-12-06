package com.lemon.java.day10;

public class Student extends Person{

        String major;
        public Student(){

        }
        public Student(String name,int age,String major){
            setAge(age);
            setName(name);
            this.major = major;
        }
        public void login(){
            System.out.println("登录");
        }
        public void show(){
            System.out.println("age" +   getName());
        }
}

