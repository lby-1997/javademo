package xuexi;

/*
基本数据类型之间的转换：
（1）自动类型转换
    1，把存储范围小的类型的值赋值给存储范围大的类型的变量，自动可以完成升级
    byte->short->int->long->float->double
            char->
    2，boolean不参与
    3，byte，short，char如果进行算术运算都会自动升级为int

（2）强制类型转换
    1，把存储范围大的类型的值，赋值给存储范围小的时候，需要强制类型转换
    double->float->long->int->short->type
                            ->char
     强制类型转换是有风险的，可能会溢出或损失精度
    2，boolean不参与
    3，当需要把某个存储范围小的变量强制提升为存储范围大的类型时，也可以使用强制类型转换
 */
public class TypeChange {
    public static void main(String[] args){
        /*
        左边看d1是double类型
        右边看10是int类型
        int类型的值，赋值给了double类型的变量，那么它会自动升级为double,输出为10.0，double形式。
         */
        double d1= 10;
        System.out.println("d1 = " + d1);
        /*
        i1是int类型，10.0是double类型。
        double类型的值，赋值给int类型的变量，如果直接赋值会报错：错误：不兼容的类型：从double转换到int类型会损失精度
        int i1 = 10.0;
        System.out.println(i1);
         */
        int i1 = (int)10.0;
        System.out.println("i1 = " + i1);

        byte b1 = 1;
        byte b2 = 2;
        //byte b3 = b1 + b2;//报错，java: 不兼容的类型: 从int转换到byte可能会有损失，因为byte+byte自动升级为int
        //System.out.println("b3 = "+ b3);
        //short+short会自动升级为int
        //char+char自动升级为int
        int x = 1;
        int y = 2;
        System.out.println("x / 2 = " +x/y);//整数，还是整数
        System.out.println("x / 2 = " + (double)+x/y);//先转换double在计算，变成正常的
    }
}
