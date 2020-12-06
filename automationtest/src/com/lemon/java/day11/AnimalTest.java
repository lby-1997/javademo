package com.lemon.java.day11;

import java.sql.Connection;

//多态性的使用举例一
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }
    public void func(Animal animal){//Animal animal = new Dog();
        animal.eat();
        animal.show();
    }

}
class Animal{
    public void eat(){
        System.out.println("Animal。eat动物");
    }
    public void show(){
        System.out.println("Animal。show动物叫");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog。eat狗");
    }

    @Override
    public void show() {
        System.out.println("Dog.sohw汪");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat.eat11");
    }

    @Override
    public void show() {
        System.out.println("cat.show123");
    }
}
//举例二：
//class Order{
//    public void method{Object obj){
//
//    }
//}
//举例三
class Driver{
    public void Data(Connection conn){// conn = new MySQlConnection()
        //规范的步骤去操作数据

    }
}