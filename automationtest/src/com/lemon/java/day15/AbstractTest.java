package com.lemon.java.day15;
/*
abstract关键字的使用
1.abstract：抽象的
2.abstract可以用来修饰的结构：类，方法

3.abstract 修饰符，抽象类
            >此类不能实例化
            >抽象类中一定有构造器，便于子类实例化时使用(涉及：子类对象实例化的全过程)
            >提供抽象类的子类，让这个子类去实例化
4.abstract修饰方法，抽象类
        >抽象方法只有方法的声明，没有方法体
        >包含抽象方法的类，一定是一个抽象类，反之，抽象类中可以没有抽象方法。
        >若子类重写了父类中所有的抽象方法，此子类才可以实例化
        >若子类没有重写父类中所有抽象方法，则意味着此子类也是抽象类，需要使用abstract
 */
public class AbstractTest {
    public static void main(String[] args) {
        // Person p1 = new Person();
    }
}
abstract class Person{
    String name;
    int age;
    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
    public abstract void eac();
class Student extends Person{
    public Student(String name,int age){
        super(name,age);
    }
    public void eat(){

    }

    @Override
    public void eac() {

    }
}
}

