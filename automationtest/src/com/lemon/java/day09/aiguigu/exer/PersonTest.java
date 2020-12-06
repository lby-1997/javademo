package com.lemon.java.day09.aiguigu.exer;
/*1，创建程序，其中定义两个类，Person和PersonTest类。定义如下：
用setAge()设置人得合法年龄(0~130),用getAge()返回人得年龄
 2.练习2
    2.1在前面定义得Person类中添加构造器，利用构造器设置所有人age属性初始值为18.
    2.2修改上题中类和构造器，增加name属性，使得每次创建Person对象得同时初始化对象得age属性和name属性
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("年龄为： " + p1.getAge());
        
        Person p2 = new Person("Tom",21);
        System.out.println("name = " + p2.getName() + ", age = " + p2.getAge());
    }
}
