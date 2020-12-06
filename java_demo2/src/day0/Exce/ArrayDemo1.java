package day0.Exce;
import java.util.Scanner;
public class ArrayDemo1 {
    public static void main(String[] args){
        //1，使用Scanner,读取学生个数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数： ");
        int number = scan.nextInt();
        //2，创建数组，储存学生成绩，动态初始化
        int[] scores = new int[number];
        //3，给数组中的元素赋值
        System.out.println("请输入" + number + "个学生成绩： ");
        int maxScore = 0;
        for(int i = 0; i < scores.length; i++){
            scores[i] = scan.nextInt();
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
        }
        System.out.println("学生中最高分为： " + maxScore);
        //4，根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级与提示
        char level;
        for(int i = 0; i< scores.length; i++){
            if(maxScore - scores[i] <= 10){
                level = 'A';
            }else if(maxScore - scores[i] <= 20){
                level = 'B';
            }else if(maxScore - scores[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student " + i + " score is " + scores[i] + ", grade is "+ level);
        }
    }
}
