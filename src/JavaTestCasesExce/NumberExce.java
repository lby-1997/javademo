package JavaTestCasesExce;
//100以内质数

public class NumberExce {
    public static void main(String[] args){
        int count = 0;
        long start = System.currentTimeMillis();
        label:for(int i = 2; i <= 100000; i++){//遍历100以内的自然数
                for(int j = 2; j <=Math.sqrt(i); j++){//j：被i去除
                if(i % j == 0){//i被j除尽
                    continue label;
                }
            }
            count++;
        }
        long start1 = System.currentTimeMillis();
        System.out.println(count);
        System.out.println(start1-start);
    }
}
