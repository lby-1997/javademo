package com.lemon.java1.day01;

public class Mobilephone {
    /**
     * 品牌
     */
    private String brand;
    /**
     * 产品类型
     */
    private String generation;
    /**
     * 价格
     */
    private int price;

    /**
     * 给手机设置品牌
     * @param brand
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    /**
     * 给手机设置价格
     * @param price
     */
    public void setPrice(int price){
        this.price = price;
    }
    /**
     * 给手机设置型号
     * @param generation
     */
    public void setGeneration(String generation){
        this.generation = generation;
    }
    /**
     * 发短信
     */
    public void senMessage(int[] name){
        System.out.println(name + "回家啊");
        System.out.println(this.brand+this.generation);
    }
    public int getPrice(){
        return price;
    }
    public String getBrand(){
        return brand;
    }
    public String getGeneration(){
        return generation;
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
        mobilephone.setPrice(2222);
        mobilephone.setBrand("小米");
        mobilephone.setGeneration("2");
        String brand1 = mobilephone.getBrand();
        int brand2 = mobilephone.getPrice();
        String brand3 = mobilephone.getGeneration();
        System.out.println(brand2+brand1+brand3);
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
