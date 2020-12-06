package com.lemon.java.day16;

/*
一，异常体系结构
java.lang.Throwable
    |-----------java.lang.Error:一般不编写针对性的代码进行处理。
    |-----------java.lang.exception:可以进行异常的处理
        |-----编译时异常(checked)
            |----IOException
                |----FileNotFoundException
            |--ClassNotFoundException
        |-----运行时异常(unchecked)
            |-----NullPointerException
            |-----ArrayIndexOutOfBoundsException
            |-----ClassCastException
            |-----NumberFormatExcepetion
            |-----InputMismatchException
            |-----ArithmaticException
 */
public class ExceptionTest {

    /*
    以下是运行时异常
     */
    // @Test
    // public void test6(){
    //     int a = 10;//java.lang.ArithmeticException: / by zero
    //     int b = 0;
    //     System.out.println(a / b);
    // }
    // @Test
    // public void test5(){//InputMismatchException输入的内容不匹配
    //     Scanner scanner = new Scanner(System.in);
    //         int sc = scanner.nextInt();
    //         System.out.println(sc);
    // }
    // @Test
    // public void test4(){//java.lang.NumberFormatException: For input string: "abc"本身不是数值
    //     String str = "123";
    //     str="abc";
    //     int num = Integer.parseInt(str);
    //     System.out.println(num);
    // }
    // @Test
    // public void test3(){
    //     Object obj  = new Date();
    //     String str = (String)obj;//java.lang.ClassCastException强转异常
    // }
    // @Test
    // public void test1(){
    //     @Test
    //     public void test2(){
    //         String str = "abc";
    //         System.out.println(str.charAt(10));//java.lang.StringIndexOutOfBoundsException: String index out of range: 10
    //         int[] arr = new int [10];
    //         System.out.println(arr[10]);//ArrayIndexOutOfBoundsException:
    //     }
        // int[] arr = new int [3];//ArrayIndexOutOfBoundsException
        // System.out.println(arr[3]);
        // String str = "abc";//NullPointerException
        // str = null;
        // System.out.println(str.charAt(0));
    // }
}
