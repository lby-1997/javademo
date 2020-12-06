package com.lemon.java.day04;

public class MyDate {
    public static void main(String[] args) {
        MyDate1[] data = new MyDate1[2];
        for(int i = 1; i<=data.length; i++){
            data[i] = new MyDate1();

        }
    }
}
class MyDate1{
    int year;
    int month;
    int day;
    public String info(){
        return year + "年: " + month + "月: " + day + "日";
    }
}
