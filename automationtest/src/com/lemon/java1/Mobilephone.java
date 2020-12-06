package com.lemon.java1;

public class Mobilephone {
    /**
     * 品牌
     */
    public String brand;
    /**
     * 产品类型
     */
    public String generation;
    /**
     * 价格
     */
    public int price;

    /**
     * 发短信
     */
    public void senMessage(int[] name){
        System.out.println(name + "回家啊");
        System.out.println(this.brand+this.generation);
    }

    /**
     *
     * @param
     */
    public Mobilephone(){

    }
    public Mobilephone(String brand,String generation,int price){
        this.brand = brand;
        this.generation = generation;
        this.price = price;
    }
    public static void main(String[] args) {
        //给小明发短信
        Mobilephone mobilephone = new Mobilephone("华为","p1",122);
        String name = "小明";
        int[] name1 = new int[]{1,2,3,4,5};
        mobilephone.senMessage(name1);
        String[] namess = {"张三","李四"};
        mobilephone.test(namess);
        String gre = mobilephone.grade(99);
        System.out.println(gre);

    }
    public void test(String[] names){
        for(String name :names){
            System.out.println(name);
        }
    }
    //根据学院分数判断成绩，并将等级输出来
    public String grade(int score){
        if(score < 60){
            return "C";
        }else if(score >= 60 && score <= 80){
            return "B";
        }else{
            return "A";
        }
    }
}
