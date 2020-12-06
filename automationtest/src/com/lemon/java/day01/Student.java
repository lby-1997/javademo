package com.lemon.java.day01;

public class Student {
    public static void main(String[] args) {

        StudentTest p1 = new StudentTest();
        p1.name = "李";
        p1.age = 10;
        p1.mojor = "修车";
        p1.interests = "无兴趣";
        p1.say();
        Teachar p2 = new Teachar();
        p2.name = "数学老师";
        p2.age = 55;
        p2.course = "数学";
        p2.teachAge = 30;
        p2.say();
    }

}
class StudentTest{
    String name;//姓名
    int age;//年龄
    String mojor;//专业
    String interests;//兴趣
    public void say(){
        System.out.println(" name: " + name + " age:  " + age  + " mojor: " + mojor + " interests: " + interests );
    }
}
class Teachar{
    String name;//姓名
    int age;//年龄
    int teachAge;//教育年龄
    String course;//课程
    public void say(){
        System.out.println(" name: " + name + " age:  " + age  + " course: " + course + " teachAge: "+ teachAge);
    }
}



