package com.lemon.java.day09.aiguigu1;
/*
this关键字得使用：
1.this可以用来修饰，调用：属性，方法，构造器

2.this修饰属性和方法：
    this理解为：当前对象,或，当前正在创建得对象
    2.1在类得方法中，我们可以使用"this.属性" 或"this.方法"得方式，调用当前对象得属性或者方法
    通常情况下，我们都选择省略"this."。特殊情况下，如果方法得形参和类得属性同名时，我们必须显
    式得使用"this.变量"得方式，表明此变量是属性，而非形参。
    2.2在类得构造器中，我们可以使用"this.属性" 或"this.方法"得方式，调用当前对象正在创建得属性或者方法
    通常情况下，我们都选择省略"this."。特殊情况下，如果构造器得形参和类得属性同名时，我们必须显
    式得使用"this.变量"得方式，表明此变量是属性，而非形参。
3.this修饰，调用构造器
    ①，我们在类得构造器中，可以显式得使用"this(形参列表)"方式，调用本类中指定得其他构造器。
    ②，构造器中不能通过"this(形参列表)"方式调用自己
    ③，如果一个类中有n个构造器，则最多有 n-1构造器使用了"this(形参列表)"
    ④，规定，"this(形参列表)"必须定义在当前的首行。
    ⑥，构造器内部 最多只能声明一个"this(形参列表)"，用来调用其他的构造器。
 */
public class PersonTest {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.setAge(1);
        // System.out.println(p1.getAge());
        // p1.eat();
        Person p2 = new Person("jerry",20);
        System.out.println(p2.getAge());
    }
}
class Person{
    private String name;
    private int age;
    public Person(){
        // this.eat();
        String info = "Person初始化时，需要考虑如下得1,2,3,4...(40行代码)";
        System.out.println(info);
    }
    public Person(String name){
        this();
        this.name = name;
        //Person初始化时，需要考虑如下得1,2,3,4...(40行代码)
    }
    public Person(int age){
        this();
        this.age = age;
        //Person初始化时，需要考虑如下得1,2,3,4...(40行代码)
    }
    public Person(String name,int age){
        this(age);
        this.name = name;
        //this.age = age;
        //Person初始化时，需要考虑如下得1,2,3,4...(40行代码)
    }
    public void setName(String name){

        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void eat(){
        System.out.println("吃饭");
        this.study();
    }
    public void study(){
        System.out.println("人学习");
    }
}
