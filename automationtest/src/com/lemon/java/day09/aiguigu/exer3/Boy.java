package com.lemon.java.day09.aiguigu.exer3;

public class Boy {
    private String name;
    private int age;
    public Boy(){
    }
    // public Boy(int age) {
    //     this.age = age;
    // }
    // public Boy(String name) {
    //     this.name = name;
    // }
    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void marry(Girl girl){
        System.out.println("我想取： "+ girl.getName());
    }
    public void shout(){
        if(this.age >= 22){
            System.out.println("可以领证了");
        }else{
            System.out.println("先同居把");
        }
    }
}
