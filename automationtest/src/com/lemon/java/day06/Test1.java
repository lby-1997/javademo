package com.lemon.java.day06;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{14,3,4,6,7,7,5,6,56,6,65,7,567,56,7,57,576};
        for(int i = arr.length -1; i >=0; i--){
            arr[i] = arr[i] / arr[0];
         System.out.print(arr[i] +"\t");
        }
        System.out.println();
        System.out.println("*********************************");
        int temo = arr[0];
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] / temo;
            System.out.print(arr[i]+ "\t");
        }
        int [] arr2 = new int[19];
        System.out.println(arr2);
        char[] arr1 = new char[]{'a','b'};
        System.out.print(arr1);
    }
}
