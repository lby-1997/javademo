package day0;
/*
二维数组的使用
1，对于二维数组的理解，我们可以堪称是一维数组又作为另一个一维数组的元素而存在。
其实，从数组底层的运行机制来看，其实没有多维数组。
2，一维数组的使用/二维数组
    ① 一维数组的声明和初始化
    ② 如何调用数组的指定位置的元素
    ③ 如何获取数组的长度
    ④ 如何遍历数组
    ⑤ 数组元素的默认初始化值
    ⑥ 数组的内存解析
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //1，二维数组的声明和初始化
        int[] arr = new int[]{1,2,3,4};
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8,}};
        //动态初始化1
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        int[] arr4[] = new int[3][];
        //类型推断
        int[][] arr5 = {{1,2,3},{4,5},{6,7,8,}};
        System.out.println(arr5[1]);
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);
        System.out.println(arr1[1].length);
        for(int i = 0; i< arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
        }System.out.println();
    }
}
