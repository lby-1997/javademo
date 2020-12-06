package com.lemon.java.day09;
/*
类的构造之三:构造器(或构造方法：constructor)得使用
construct:建设，建造。construction:CCB   constructor：建设者
一，构造器得作用：
1.创建对象
2.给对象进行初始化
二，说明，
1.如果没有显式得定义类得构造器得话，则系统默认提供一个空参得构造器
2.定义构造器得格式：权限修饰符 类名(形参列表){}
3.一个类中定义得多个构造器，彼此够成重载
4.一旦我们显式得定义了类得构造器之后，系统就不再提供默认得空参构造器
5.一个类中，至少会有一个构造器
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建类得对象: new + 构造器
        Person p = new Person("Tom");
        System.out.println(p.getAge());
    }
}
class Person{
    private String name;
    private int age;

    //构造器
    public Person(){
        System.out.println("Person()...");
    }
    public Person(String n){
        name = n;

    }
    public String getAge(){
        return name;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void study(){
        System.out.println("玩");
    }
}
