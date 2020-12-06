package day3;

import java.util.Arrays;

public class YanZheng {
    public static void main(String[] args) {
        int[] ns = {12, 28, 89, 73, 65, 18, 96, 58, 8, 36};
        int[] arr = new int[ns.length];
        System.out.println(Arrays.toString(ns));
        for (int i = ns.length - 1; i >= 0; i--) {
            for (int j = 0; j >= arr.length - 1; j++) {
                int arr1 = ns[i];
                arr[j] = arr1;
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1]= temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
