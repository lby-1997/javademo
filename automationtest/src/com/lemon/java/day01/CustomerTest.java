package com.lemon.java.day01;

/*
类中方法得声明和使用

方法：描述类应该具有得功能：
比如：Math类：sqrt()\random()\...
      Scanner类:nextXxx()....
      Arrays类：sort() \ binarySearch()\ toString() \equals() \..

1.举例：
    public void eat(){}
    public void sleep(int hour){}
    public String getName(){}
    public String getNation(String nation){}
   方法得分类：按照有形参无形参，有返回值，无返回值
             无返回值               有返回值
    无形参：void方法名(){}         返回值得类型 方法名（）{}
    有形参：void方法名(形参列表){}  返回值得类型 方法名（形参列表）{}
2.方法得声明：权限修饰符 返回值类型 方法名(形参列表){
               方法体
            }
    注意：static,final,abstract,来修饰得方法，后面在说。
3.说明：
    3.1关于权限修饰符.先默认方法得权限修饰符先使用public
        java规定得4中权限修饰符：private，public(权限最大)，缺省,protected  -->封装性再说
    3.2 返回值类型：有返回值 vs 没有返回值
        3.2.1如果方法有返回值，则必须在方法声明时，指定返回值得类型.同时，方法中，需要使用
                 return关键字来返回指定类型得变量和常量。"return 数据"。
               如果方法没有返回值，则方法声明时，使用void来表示。通常，没有返回值得方法中，就
                 不需要使用return，但是如果使用得话，只能“return”;表示结束此方法得意思。
        3.2.2我们定义方法该不该有返回值？
            ①，题目要求
            ②，凭经验，具体问题具体解决
     3.3 方法，名，属于标识符，遵循标识符得规则和规范，"见名知意"
     3.4 形参列表：方法可以声明0个，1个，或者多个形参
        3.4.1格式：数据类型1 形参1，数据类型2 形参2，...
        3.4.2我们定义方法时，该不该定义形参？
            ①，题目要求
            ②，凭经验，具体问题具体解决
     3.5 方法体，方法功能得体现。

4.return关键字得使用：
        1.使用范围：使用在方法体中
        2.作用：   ① 结束方法
                   ② 针对于有返回值类型得方法，使用"return 数据 "方法返回所要得数据。
        3.注意： return后面不可以在声明执行语句
5.方法得使用中，可以调用当前类得属性或方法
            特殊的：方法A中又调用了方法A：这种是递归方法
            方法中，不可以定义方法
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.eat();
        cust1.age = 55;
        cust1.name = ("哈哈");
        cust1.getName();
        cust1.sleep(8);
    }
}

class Customer{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");
        eat();
        sleep(10);

    }
    public String getName(){
        if(age > 18) {
            return name;
        }else{
            return "Tom";
        }
    }
    public String getNation(String nation){
        String info = "我得国际是： " + nation;
        return info;
    }
    public void sort(int[] arr){
    }
    public void info(){

    }
}