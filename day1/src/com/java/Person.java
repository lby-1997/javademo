package com.java;

/**
 * @author shkstart
 * @create 2020--12--06--13:10
 */
public class Person {
    private String name;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }
    private Person(String name){
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println("一个人");
    }
    private String showNation(String nation){
        System.out.println("国际是： " + nation);
        return nation;
    }
}
