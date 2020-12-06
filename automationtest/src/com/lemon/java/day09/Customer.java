package com.lemon.java.day09;
/*
javabean是一种java语言写成得可重用组件。
    所谓javabean，是指符合如下标准得java类：
            >类是公共得
            >有一个无参得公共得构造器
            >有属性，且有对应得get,set方法
 */
public class Customer {
    private int id;
    private String name;
    public Customer(){

    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
