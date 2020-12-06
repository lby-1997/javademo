package com.lemon.java.day10;
/*
面向对象的特征之二：继承性 why?
一，继承性的好处：
    ①，减少了代码的冗余，提高了代码的复用性
    ②，便于功能的扩展
    ③，为之后多态的使用，提供了前提

二，继承性的格式， calss A extends B{}
    A：子类，派生类，subclass
    B：父类，超累，基类，superclass

    2.1体现：一旦子类A继承父类B以后，子类A就获取了父类B中声明的结构：属性，方法。
     特别的：父类中声明为private的属性和方法，子类继承父类以后，仍然认为获取了父类中私有的结构。
    只有因为封装性的影响，使得子类不能直接调用父类的结构而已。

    2.2子类继承父类以后，还可以定义（声明）自己特有的属性和方法：实现功能的拓展。
     父类功能比较单一，子类可以扩展。
     extends：延展，扩展。
三：java中继承性的规定
    1.一个父类可以被多个子类继承
    2.java中类的单继承性：一个子类只能有一个父类
    3.子父类是相对的概念。
    4.子类直接继承的父类，称为直接父类。间接继承的父类称为：间接父类
    5.子类继承父类以后，就获取了直接父类以及所有间接父类中声明的属性和方法。

四，1.如果我们没有显示的声明一个类的父类的话，则此类继承于java.lang.Object类
    2.所有的java类(除java.lang.Object类之外)都直接或间接的继承于java.lang.Object类
    3.意味着，所有的java类具有java.lang.Object类声明的功能。

 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        // p1.age = 1;
        // p1.eat();
        // p1.name = "tom";
        // Student p2 = new Student();
        // p2.login();
        // p2.name = "om";
        // p2.age = 22;
        // System.out.println(p2.age+p2.name);
        p1.eat();
        p1.breath();
        com.lemon.java.day10.Creature c = new com.lemon.java.day10.Creature();
        System.out.println(c.toString());
    }
}
