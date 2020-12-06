package com.lemon.java.day09.aiguigu.exer;
/*1，创建程序，其中定义两个类，Person和PersonTest类。定义如下：
用setAge()设置人得合法年龄(0~130),用getAge()返回人得年龄
 */
public class Person {
    private  int age;
    private String name;
    public Person(){
        age = 18;
    }
    public Person(String n,int a){
        name = n;
        age = a;
    }
    public void setAge(int a){
        if(a < 0 || a > 130){
            System.out.println("传入非法");
            return;
        }
        age = a;
    }
    public int getAge(){
        return  age;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
