package com.lemon.java.day09.aiguigu.exer2;

public class Student {
    public static void main(String[] args) {
        Student test = new Student("李",23);
        System.out.println(test.getName()+ ","+test.getAge());
        Student test1 = new Student("王晓宇",22,"宝宝","笨蛋");
        System.out.println(test1.getName()+","+test1.getAge()+","+test1.getSchool()+","+test1.getMajor());

    }
    String name;
    int age;
    String school;
    String major;
    public Student(String n,int a){
        name = n;
        age = a;
    }
    public Student(String n,int a,String s){
        name = n;
        age = a;
        school = s;
    }
    public Student(String n,int a,String s,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setSchool(String s){
        school = s;
    }
    public String getSchool(){
        return school;
    }
    public void setMajor(String m){
        major = m;
    }
    public String getMajor(){
        return major;
    }
}

