package com.lemon.java.day09;
/*
总结：属性赋值得先后顺序
①，默认初始化值
②，显示初始化
③，构造器中赋值（初始化）
④，通过"对象.方法"或"对象.属性"得方式，赋值

以上操作得先后顺序，1 - 2 - 3 - 4
 */
public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.age);
        User u1 = new User(2);
        u1.setAge(3);
        System.out.println(u1.age);
    }
}
class User{
    String name;
    int age = 1;
    public User(){

    }
    public User(int age){
        this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
