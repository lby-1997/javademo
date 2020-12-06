package com.lemon.java.day11.exer5;
/*
面向对象特征之三：多态性
1.理解多态性：可以理解为一个事物的多种形态
2.何为多态性
    对象的多态性，父类的引用指向子类的对象(或子类的对象赋给父类的引用)
3.多态的使用，虚拟方法调用
    有勒对象的多态性以后，我们在编译器，只能调用父类中声明的方法，但在运行期，我们实际执行的是父类重写子类的方法
    总结：编译，看左边。运行看右边
4.多态性的使用前提：①，类得继承关系 ②，方法的重写
5.对象的多态性，只适用于方法，不适用于属性(编译跟运行都看左边)

6.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        Man man = new Man();
        man.eat();
        man.age = 25;
        man.monkey();

        //对象的多态性，父类的引用指向子类的对象
        Person pe = new Man();
        //多态的使用，当调用父类同名同参数的方法时，实际执行的是子类重写父类的方法---虚拟方法调用
        pe.eat();
        System.out.println("*********************");
        //不能调用子类所特有的方法，属性：编译时，P2是Person类型
        //有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致
        //编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用

        //如果才能调用子类特有的属性和方法？？？(使用Man m1 = (Man)pe;强转)
        Man m1 = (Man)pe;
        m1.monkey();
        boolean fa = m1.isSmokind = true;
        System.out.println(fa);
        //使用强转时，可能会出现java.lang.ClassCastException的异常
        // WoMen m2 = (WoMen)pe;
        // m2.eat();
        /*
        instanceof关键字的使用
         a instanceof A:判断对象a是否是类A的示例。如果时返回true；如果不是返回false
         使用场景：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行
         instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型

         如果a instanceof A返回true，则a instanceof B也返回true
         其中，类B是类A的父类》
         */
        if(pe instanceof WoMen){
            WoMen w1 = (WoMen)pe;
            w1.goShopping();
            System.out.println("women");
        }
        if(pe instanceof Man){
            Man m2 = (Man)pe;
            m2.monkey();
            System.out.println("man");
        }
        if(p1 instanceof Person){
            System.out.println("sout");
        }
        //练习：
        //问题一：编译通过，运行时不通过
        Person p3 = new WoMen();
        Man mm = (Man)p3;

        //问题二，编译通过，运行时也通过
        Object boj = new WoMen();
        Person p = (Person)boj;
    }
}
