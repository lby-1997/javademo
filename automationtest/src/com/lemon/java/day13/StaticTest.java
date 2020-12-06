package com.lemon.java.day13;
/*
static关键字的使用
1.static：静态的
2.static可以用来修饰：属性，方法，代码块，内部类
3.使用static修饰属性：
        3.1属性：按是否使用static，又分为：静态属性 vs 非静态属性(实例变量)
            实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套中的非静态属性，修改一种一个非静态属性时，不会导致其他对象中同样的属性值修改
            静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量，当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量时，是修改过了的。
        3.2 static修饰属性的其他说明：
            ①，静态变量随着类的加载而加载。
            ②，静态变量的加载早于对象的创建
            ③，由于类只会加载一次，则静态变量在内存中也只会存在一份,存在方法区的静态域中.

            ④，      类变量     实例变量
            类       yes        no
            对象     yes        yes
4.使用static修饰方法：静态方法
    ①，随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
    ④，          类变量     实例变量
        类       yes        no
        对象     yes        yes
    ③，静态方法中，只能调用静态的方法或属性
       非静态方法中，即可以调用非静态的方法或属性，也可以调用静态的方法或属性。
5.static注意点：
    5.1在静态的方法内，不能使用this，super关键字。
    5.2关于静态属性和静态方法的使用，大家都从生命周期的角度去理解。
6.  如何确定一个属性是否声明为static？
        -->属性是可以被多个对象所共享的，不会随着对象的不同而不同的.

    如何确定一个方法是否要声明为static
    -->操作静态属性的方法，通常设置为static的
    -->工具类中的方法，习惯上声明为static的。比如Math,Ayyays
 */
public class StaticTest {
    public static void main(String[] args) {
        String s1 = Chinese.nation ="中国";
        Chinese c1 = new Chinese();
        c1.name = "小张";
        c1.age = 40;
        Chinese c2 = new Chinese();
        c2.name = "大王";
        c2.age = 55;
        c1.nation = "ss";
        System.out.println(s1);
        String s2 = Chinese.nation ="da";
        System.out.println(s2);
        Chinese.os();
        Chinese.ez();

    }
}
//中国人
class Chinese{
    String name;
    int age;
    static String nation;
    public void sta(){
        ez();
    }
    public static void ez(){
        System.out.println("ss");
        System.out.println(nation);
    }
    public static void os(){
        System.out.println("zg");
    }
}