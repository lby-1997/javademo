package com.lemon.java.day02;

public class Person {
    String name;
    int age;
    /**
     * sex：1 表明男性
     * sex：2  表示女性
     */
    int sex;
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age: " + age);
    }
    public int addAge(int i){
        age +=i;
        return age;
    }

}

