package com.lemon.java7;


import java.util.Objects;

public class Person implements Comparable {
    private String name;
    private int age;

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person1 = (Person) o;
        return age == person1.age &&
                Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    //按照姓名从小到大排序
    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person1 = (Person)o;
            return this.name.compareTo(person1.name);
        }else{
            throw new RuntimeException("错了");
        }
    }
}