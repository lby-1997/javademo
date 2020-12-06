package com.lemon.java.day11.Super;

public class Student  extends Person{
    String major;
    int id = 1001;//学号
    public Student(){

    }
    public Student(String major) {
        this.major = major;
    }
    public Student(String name,int age,String major){
        super(name,age);
        // this.name = name;
        // this.age = age;
        // this.id = id;
        this.major = major;

    }
    @Override
    public void eat() {
        System.out.println("营养重要");
    }


    public void walk() {
        this.eat();
        super.eat();
        System.out.println("学习");
    }
    public void sudy(){
        System.out.println("重要么");
    }
    public void show(){
       System.out.println("name = "+ this.name + ", age = " + super.age);
        System.out.println(this.id);
       System.out.println(super.id);
    }
}
