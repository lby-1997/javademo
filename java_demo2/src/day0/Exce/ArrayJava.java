package day0.Exce;

public class ArrayJava {
    public static void main(String[] args) {
        //1,写出一维数组初始化的两种方式
        int arr1[] = new int[1];//动态初始化
        int arr2[] = new int[]{1,2,3,4,5};//静态初始化
        /*
        数组一旦初始化，其长度就是确定的。all.length
        数组长度一旦确定，就不可修改。
         */
        //2，写出二维数组初始化的两种方式
        int[][] arr3 = new int[4][3];//动态初始化1
        int[][] arr4 = new int[4][];//动态初始化2

        int[] arr5[] = new int[][]{{1,2,3},{4,5},{7,8,9}};

        //3，如何遍历如下的二维数组
        int[] arr10[] = new int[][]{{1,2,3},{4,5},{6,7,8},{10,11,12}};
        for(int i = 0; i < arr10.length; i++){
            for(int j = 0; j < arr10[i].length; j++){
                System.out.print(arr10[i][j] + "\t");
            }
            System.out.println();
        }
        //4,不同类型的一维数组元素的默认初始化值各是多少：
        /*
        整型 0
        char 0
        布尔型boolean：  false
        浮点型folat double 0.0
        String(引用类型) null

         */
        //5，一维数组的内存解析：
        /*
        String[] strs = new String[5];
        strs[2] = "Tom";
        strs = new String[3];
         */
    }
}
