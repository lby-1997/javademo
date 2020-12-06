package com.lemon.java.day13;
/*
main()方法的使用说明：
1.main()方法是作为程序的入口
2.main()方法也是一个普通的静态方法
3.main()方法可以作为我们与控制台交互的方式。
 */
public class MainTest {
    public  static void main(String[] args) {
        Main.main(new String[100]);//匿名函数
        MainTest test = new MainTest();
        test.show();
    }
    public void show(){

    }
}
class Main{
    public static void main(String[] args) {
        args = new String[100];
        for(int i = 0; i< args.length; i++){
            args[i] = "args_ "+ i;
            System.out.println(args[i]);
        }
    }
}