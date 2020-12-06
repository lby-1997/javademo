package com.lemon.java.day05;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr= new int[]{32,323,322,51,345,34,6347,347,7,5};
        int max = util.getMax(arr);
        System.out.println("最大值为： " + max);
        System.out.println("排序前： ");
        util.print(arr);
        util.sort(arr);
        System.out.println();
        System.out.println("排序后： ");
        util.print(arr);
        System.out.println("查找: ");
        int index = util.getValueIndex(arr,5888);
        if(index >= 0){
            System.out.println("找到了，索引地址为：" + index);
        }else{
            System.out.println("没找到");
        }

        util.reverse(arr);
        util.sort(arr);
    }
}
