package com.lemon.java.day08;
/*
面向对象的特征一：封装与隐藏, 3W, what(是什么)? why(为什么要用)? how(怎么用)?
一，问题的引入：
    当我们创建一个类的对象以后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值。
    这里，赋值操作要受到属性的数据类型和存储范围的制约。但是除此之外，没有其他制约条件。
    但是，在实际问题中，我们往往需要给属性赋值加入额外的限制条件。这个条件就不能在属性
    声明时提现。我们只能通过方法进行限制条件的添加。（比如：setLegs）
    同时，我们需要避免用户在使用"对象.属性"的方式对属性进行赋值。则需要讲我们属性的声明
    为私有的(private).
    -->此时，针对于属性就体现了封装性。
二，封装性的体现：
我们将类的属性私有化(private)，同时，提供公共的(public)方法来获取(getxxx)和设置(setxxx)此属性的值.

扩展：封装性的体现：① 如上 ② 不对外调用的私有的方法(private) ③ 单例模式...

高内聚，低耦合
高内聚：类的内部数据操作细节自己完成，不允许外部干涉；
低耦合：仅对外暴露少量的方法用于使用。

隐藏对象内部的复杂性，只对外公开简单的接口。便于外界调用，从而提高系统的可扩展性，可维护性。
通俗的说，把该隐藏的隐藏起来，该暴露的暴露出来。这就是封装性的设计思想。
三，封装性的体现，需要权限修饰符来配合。
1.java规定的四种权限(从小到大)：private，缺省，protected，public
2.四种权限可以用来修饰类及类的内部结构：属性，方法，构造器，内部类
对于类，只能使用，缺省，public
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "老母猪叶飞";
        // a.legs = 4;
        // a.show();

        // a.show();
        a.getAge();
        a.setLegs(10);
        System.out.println(a.getLegs());
        // a.show();
        // System.out.println(a.name);
    }
}
class Animal{
    String name;
    private int age;
    private int legs;//腿个数
    //属性的设置
    public void setLegs(int legs){
        this.legs = legs;
        if(legs >= 0 && legs % 2 == 0){
            this.legs = legs;
        }else{
            this.legs = 0;
            //抛出一个异常，(还不会)
        }
    }

    //属性的获取
    public int getLegs(){
        return legs;
    }
    public void eat(){
        System.out.println("动物进食");
    }
    public void show(){
        System.out.println("name= "+ name + ",age= " + age + ",legs= "+legs);
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
}
