package day0;
/*
二维数组的使用，
规定，二维数组分为外层数组的元素，内层数组的元素
    int[] arr[] = new int[4][3];
    外层元素, arr[0],arr[1]等
    内层元素,arr[0][0].arr[1][2]等

    ⑤，数组元素的默认初始化值
    针对初始化方式一，比如，int[][] arr = new int[4][3];
        外层元素的初始化值为：地址值
        内层元素的初始化值为：与一维数组初始化情况相同

    针对初始化方式二，比如，int[][] arr = new int[4][];
        外层元素的初始化值为：null
        内层元素的初始化值为：不能调用，否则报错空指针异常。

    ⑥，数组的内存解析

 */
public class ArrayTest3 {
    public static void main(String[] args){
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//[I@4554617c
        System.out.println(arr[0][0]);//0
        System.out.println("**********");

        float[][] arr1 = new float[4][3];
        System.out.println(arr1[0]);//地址值
        System.out.println(arr1[0][0]);//0.0
        System.out.println("***********");

        String[] arr2[] = new String[4][2];
        System.out.println(arr2[1]);//地址值
        System.out.println(arr2[1][1]);//null
        System.out.println("***********");

        double[] arr3[] = new double[4][];
        System.out.println(arr3[1]);//null
        System.out.println(arr3[1][0]);//java.lang.NullPointerException,空指针异常

        int[] arr10[] = new int[4][];
        arr10[1] = new int[]{1,2,3,4};
        arr10[2] = new int[4];
        arr10[2][1] = 30;

    }
}
