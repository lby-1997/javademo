package com.lemon.java.day15;
/*
接口的使用
1.接口使用inteface定义
2.在java中，接口和类是并列的结构
3.如何定义接口，定义接口中的成员
    3.1 JDK7已经以前：只能定义全局常量和抽象方法
            >全局常量 public static final的,可以省略
            >抽象方法：public abstract的

    3.2 JDK8:除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
4.接口中不能定义构造器！意味着接口不可以实例化

5.java开发中，接口通过让类去实现(implements)的方式来使用
    如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
    如果实现类没有覆盖接口中的所有的抽象方法，则此实现类仍为一个抽象类
6.java类可以实现多个接口 --->弥补了java单继承的局限性
    格式： Class AA extends BB implements CC,DD{}

7.接口跟接口之间可以继承，而且可以多继承

8.接口的具体使用，体现多态性
9.接口，实际上可以看作是一种规范

抽象类与接口有哪些异同？
 */
interface Attackable{
    void stat();//抽象方法
}
public class Interface {
    public static void main(String[] args) {
        System.out.println(jk.MAX_SPEED);
        Plane pl = new Plane();
        pl.fly();
    }
}
interface jk{
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//省略勒public static final

    //抽象方法
    public abstract void fly();
    void stop();//省略勒public abstract
}
class Plane implements jk{
    @Override
    public void fly() {
        System.out.println("飞机通过引型起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}
class Bullet extends Plane implements jk,Attackable{

    @Override
    public void stat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}
