package day1;
//反转
public class ArrayExce4 {
    public static void main(String[] args) {
        // String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
        // String[] arr1 = new String[arr.length];
        // for(int i = 0; i < arr1.length; i++){
        //     arr[i] = arr[i];
        // }
        //方式一
//        for(int i = 0; i < arr.length / 2; i++){
//            String temp = arr[i];
//            arr[i] = arr[arr.length - i -1 ];
//            arr[arr.length -i -1] = temp;
//        }
        //方式二
//        for(int i = 0, j = arr.length-1; i<j ; i++,j--){
//            String temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
        //遍历
        // for(int i = 0; i< arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        //
        // //查找（或搜索）
        // //线性查找
        // String desc = "CC";
        // boolean isFlag1 = true;
        // for(int i = 0; i < arr.length; i++){
        //     if(desc.equals(arr[i])){
        //         System.out.println("找到了指定得元素，位置为： " + i);
        //         isFlag1 = false;
        //         break;
        //     }
        // }
        // if(isFlag1){
        //     System.out.println("没有，滚");
        // }
        //二分法查找
        //前提，查找得数组必须有序。
        int[] arr2 = new int[]{30,20,50,10,80,9,7,12,100,40,8};
        int desc1 = -44;
        desc1 = 30;
        int head = 0;//初始的首索引
        int end = arr2.length - 1;
        boolean isFlag = true;
        while (head <= end){
            int middle = (head + end ) /2;
            if(desc1 == arr2[middle]){
                System.out.println("找到了指定得元素，位置为： " + middle);
                isFlag = false;
                break;
            }else if(arr2[middle] > desc1){
                end = middle -1;
            }else{
                head = middle + 1;
            }
        }
        if(isFlag){
            System.out.println("没有");
        }
    }
}
