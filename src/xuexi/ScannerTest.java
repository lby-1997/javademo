import  java.util.Scanner;
/*
1,导入Scanner ， imoprt java.util.Scanner;
2,Scanner的实例化：Scanner scan = new Scanner(System.in);
3,调用Scanner类的相关方法(next()/ nextXxx())，来获取指定类型的变量
 */
//对应的方法，需要输入执行类型的值。如果输入错误的，就会报异常(InputMismatchException)类型不匹配，导致程序终止。
public class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("请输入你的姓名：");

        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的芳龄: ");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重: " );
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("我爱王晓宇: ");
        boolean  love = scan.nextBoolean();
        System.out.println(love);

        System.out.println("请输入你的性别： ");
        String gender = scan.next();
        char genderchar = gender.charAt(0);//获取索引位0位置上的字符
        System.out.println(genderchar);
    }
}
