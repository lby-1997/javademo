package xuexi;

import java.util.Scanner;
public class DogAge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年龄： ");
        int dogAge = scan.nextInt();
        if(dogAge >=0 && dogAge <= 2){
            System.out.println("相应于人的年龄： "+ dogAge * 10.5);
        }else if(dogAge >2){
            System.out.println("相当于人得年龄： "+(2 * 10.5 +(dogAge - 2) * 4));
        }else {
            System.out.println("没有这个狗");
        }
        double value = Math.random()* 90 + 10;//[0.0,1.0)
    }
}
