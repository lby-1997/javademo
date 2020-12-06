import  java.util.Scanner;
public class IfTest {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入期末成绩：");
        int score = scan.nextInt();
        if(score == 100){
            System.out.println("你可以玩了");
        }else if(score <=99 & score >80){
            System.out.println("在学学");
        }else if(score <=80 & score >=60){
            System.out.println("自己多学学");
        }else{
            System.out.println("该补课了");
        }
    }
}
