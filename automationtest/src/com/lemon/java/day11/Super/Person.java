package com.lemon.java.day11.Super;

public class Person {
    String name;
    int age;
    int id = 1111;//唯一id
    public Person(){
        System.out.println("哈哈哈");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(){
        System.out.println("走路");
    }
}
