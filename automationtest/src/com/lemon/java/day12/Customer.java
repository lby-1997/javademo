package com.lemon.java.day12;

import java.util.Objects;

public class Customer {
    private String name;
    private int age;

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

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if(this == obj){
    //         return true;
    //     }
    //     if(obj instanceof Customer){
    //         Customer cust = (Customer)obj;
    //         //比较两个对象的每个属性是否相同
    //         // if(this.age == cust.age %% this.name.equals(cust.name)){
    //         //     return true;
    //         //  }
    //         return this.age == cust.age && this.name.equals(cust.name);
    //         }else{
    //         return false;
    //     }
    // }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
