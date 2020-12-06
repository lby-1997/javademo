package JavaExceArray;

/*

4,技巧：
外层循环控制行数，内层循环控制列数
 */
public class ForForJava {
    public static void main(String[] args) {
//        for(int j=1; j<=5; j++)
//            for(int i = 1; i <= 6; i++){
//                System.out.print("*");
//            }
//        System.out.println();
/**
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= 4-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<i+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1;i <= 4; i++){
            for(int j = 1; j <= 5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
    for(int i=1; i<=9; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j + "*" + i +"=" + j*i +" ");
        }
        System.out.println(" ");
    }
    }
}
