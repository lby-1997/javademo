package com.lemon.java.day10;
/*
为什么要用封装。
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
    三，封装的体现
       体现一：讲类的属性私有化（private），提供对外开放的（public）公共方法来获取(getXxx)和设置(setXxx)此属性的值。
       体现二：不对外暴露私有的方法
       体现三：单例模式（讲构造器私有化）
       体现四：如果不希望类在包外被调用，那么我们把类声明称缺省（类只能用两种，public或缺省）
    四，java规定的四种权限修饰符
       4.1 从小到大 private < 缺省 < protected < public
       4.2
            修饰符      类内部   同一个包  不同包的子类  同一个工程
            private      YES
            缺省         YES      YES
            protected    YES      YES       YES
            public       YES      YES       YES         YES
       4.3权限修饰符可用来修饰的结构说明：
        4种权限都可以用修饰类的内部结构：属性，方法，构造器，内部类，修饰符的话，只能使用:缺省，public
构造器
    1.构造器（或构造方法）：Constructor
     构造器的作用：
            1.创建对象
            2.初始化对象的信息
    2.使用说明：
        1.如果没有显式得定义类得构造器得话，则系统默认提供一个空参得构造器(构造器权限跟随类的权限)
        2.定义构造器得格式：权限修饰符 类名(形参列表){}
        3.一个类中定义得多个构造器，彼此够成重载
        4.一旦我们显式得定义了类得构造器之后，系统就不再提供默认得空参构造器
        5.一个类中，至少会有一个构造器
    3.举例：
        public class day10Exce {

            String name;
            int age;
            public day10Exce(){
                System.out.println("r");
            }
            public day10Exce(String name){
                this.name = name;
            }
            public day10Exce(String name,int age){
                this.name=name;
                this.age=age;
            }
        }
属性赋值的先后顺序
    ①，默认初始化
    ②，显式初始化
    ③，构造器中初始化
    ④，通过"对象.方法"或"对象.属性"的方式赋值
javabean的概念
    1，类是公共的
    2，一个无参的公共的构造器
    3，属性，且对应的get，set方法

 */

public class day10Exce {

    String name;
    int age;
    public day10Exce(){
        System.out.println("r");
    }
    public day10Exce(String name){
        this.name = name;
    }
    public day10Exce(String name,int age){
        this.name=name;
        this.age=age;
    }
}

