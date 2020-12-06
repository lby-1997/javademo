package day1;

public class ArrayExce {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++) {
            arr[i]= (int)(Math.random()*(99 - 10 + 1))+10;
            System.out.println(arr[i]);
        }

        //求数组得最大值
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值为： " + maxValue);
        //求数组得最小值
        int minValue = arr[0];
        for(int i = 1; i <arr.length; i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("最小值为： " + minValue);
        //求数组得总和
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println("总和为：" + sum);
        //求数组得平均数
        int avgValue = sum / arr.length;
        System.out.println("平均数为： " + avgValue);
    }
}
