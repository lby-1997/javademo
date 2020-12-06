package com.lemon.java.day11.ClassTest;
/*
类的内部成员之五：内部类
1.java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B成为外部类
2.内部类的分类：成员变量(静态，非静态) vs局部变量类(方法内，代码块内，构造器内)
3.成员内部类:
    一方面，作为外部的成员：
        另一方面，作为一个类：
            >类可以定义属性，方法，构造器等。
            >可以被final修饰，此类不可以被继承了，不使用就可以
            >可以被abstract修饰
 */
public class InnerTest {

}
class Person{
    //静态成员内部类
    abstract static class Dog{
        String name;
        int age;
        public void gou(){
            System.out.println("dagou");
        }
    }
    //非静态成员内部类
    final class Dog1{
        String name;
        public Dog1(){

        }
        public void sing(){
            System.out.println("11");
        }
    }
    public void method(){
        //局部内部类
        class AA{

        }
    }
    {
        class BB{

    }
    }
    public Person(){
        class  CC{

        }
    }
}
