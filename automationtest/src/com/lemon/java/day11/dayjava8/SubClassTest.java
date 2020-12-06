package com.lemon.java.day11.dayjava8;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        CompareA.method1();
        s.method3();
        //知识点1：接口中定义的静态方法，只能通过接口来调用
        s.method2();
        //知识点2：通过实现类的对象，可以调用接口中的默认方法。
        //如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法
        //知识点3，如果子类(或实现类)继承的父类和实现的接口中声明了同名参数的方法。
        //那么子类在没有重写此方法的情况下，默认调用的是父类的同名同参数方法 -->类优先原则
    }
}
class SubClass implements CompareA{
    @Override
    public void method2() {
        System.out.println("北京100");
    }
}
