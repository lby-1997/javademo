package day3;

public class ZuoYongYu {
    public static void main(String[] args) {
        int[] arr = new int[]{34,51,22,-95,55,2,5};
        // for(int i = 0; i< arr.length; i++){
        //     System.out.print(i);
        // }
        // System.out.println();
        for(int i = 0; i< arr.length - 1; i++){
            for(int j = 0; j< arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1]= temp;
                
                }
            }
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ "\t");
        }
    }
}
