package com.lemon.java.day01;

/*
面向对象的两个要素：
类，对一类事物的描述，是抽象的，概念上的定义
对象，是实际存在该类事物的每个个体，因此被称为实例。
>面向对象程序设计的重点是类的设计
一，设计类，就是设计类的成员
属性 = 成员变量 = field = 域 ，字段
方法 = 成员方法 = 函数 = method

创建类的对象 = 类的实例化 = 实例化类

二，类和对象的使用(面向对象思想落地的实现)
1.创建类，设计类的成员
2.创建类的对象
3.通过“对象.属性”或“对象.方法”调用对象的结构

三，如果创建了一个类得多个对象，则每个对象都独立拥有一套这个类得属性。（非static）
    意味着，如果我们修改一个对象得属性A，则不影响另外一个对象属性A得值。

 四，对象得内存解析
 */
//测试类
public class PersonTest {
    public static void main(String[] args) {
        //2.创建Person类的对象
        Person p1 = new Person();
        //调用对象的结构：属性，方法
        //调用属性：对象.属性
        //3，通过“对象.属性”或“对象.方法”调用对象的结构
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        //调用方法： 对象.方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");
        //****************************
        Person p2 = new Person();
        System.out.println(p2.name);//null
        System.out.println(p2.isMale);//false
        //****************************
        //将p1变量保存得对象地址值赋给P3，导致p1和p3指向了堆空间中得同一个对象实体
        Person p3 = p1;
        System.out.println(p3.name);//Tom

        p3.age = 10;
        System.out.println(p1.age);//10
    }
}
//1，创建类，设计类的成员
class Person{
    //属性：对应类的成员变量
    String name;
    int age = 1;
    boolean isMale;
    double foul;

    //方法：对应类的成员方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用的是： "+ language);
    }
}