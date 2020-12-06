package JavaTestCasesExce;
import java.util.Scanner;
public class ForExceClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("输入第一个整数： ");
        int num1= scan.nextInt();
        System.out.println("输入第二个整数：");
        int num2 = scan.nextInt();
        //获取最大公约数
        //1，获取两个书中的较小值
        int i = (num1 < num2)? num1 : num2;
        //2，遍历
        for(int num = i; num>=1; num--)
            if(num1 % num == 0 && num2 % num == 0){
                System.out.println("最大公约数为：" + num);
                break;
            }
//        int sum = 0;
//        for (int i=1; i<=10; i++) {
//            System.out.println("begin i = " + i);
//            if (i % 2 == 0) {
//                continue; // continue语句会结束本次循环
//            }
//            sum = sum + i;
//            System.out.println("end i = " + i);
//        }
//        System.out.println(sum); // 25

    }
}
