package com.lemon.java.day12;
/*
java.lang.Object类
1.Object类是所有java类的根父类
2.如果在类的声明未使用extends关键字指明其父类，则默认父类为java.lang.object类
3.Object类的功能(属性，方法)就具有通用性.
    属性：无
    方法： equals() /soString() / getClass() / gashCode() /clone() /finalize()
    wait(),notify()/notifyAll()
4.Object类之声明了一个空参的构造器
 */
public class Person {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());

    }
}
class Order{

}