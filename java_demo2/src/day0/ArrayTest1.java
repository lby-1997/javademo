package day0;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*5,数组元素的默认初始化值
            >数组元素是整型：0
            >数组元素时佛典型：0.0
            >数组元素时char型：0或'\u0000',不是0
            >数组元素时boolean型，false
            >数组元素是引用数据类型时：null

            6,数组的内存解析

        * */
        int[] arr = new int[4];
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("***********************");

        short[] arr1 = new short[4];
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("***********************");
        float[] arr2 = new float[5];
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("***********************");
        double[] arr3 = new double[5];
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }
        System.out.println("*********************");
        char[] arr4 = new char[5];
        for(int i=0; i<arr4.length; i++){
            System.out.println(arr4[i] + "/");
        }
        if(arr4[0] == 0){
            System.out.println("不好");
        }
        System.out.println("******************");
        boolean[] arr5 = new boolean[5];
        System.out.println(arr5[0]);
        System.out.println("************");
        String[] arr6 = new String[5];
        System.out.println(arr6[0]);
        if(arr6[0] == null){
            System.out.println("北京天气不好");
        }
    }
}
