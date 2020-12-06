package com.lemon.java.day11.exer01;

public class ManKind {
    private int sex;//性别
    private int salary;
    public ManKind(){

    }
    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }
    public void manOrWoman(){
        if(sex == 1){
            System.out.println("man");
        }else if(sex == 0){
            System.out.println("women");
        }
    }
    public void employeed(){
        String info = (salary ==0 )? "no job " : "job";
        System.out.println(info);
    }
    public int getSex(){
        return sex;
    }
    public void setSex(int sex){
        this.sex = sex;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

}
