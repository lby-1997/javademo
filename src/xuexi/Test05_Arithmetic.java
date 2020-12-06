package xuexi;

/*运算符：
    1，算术运算符
    加：+
    减：-
    乘：*
    除：/
        特殊：整数/整数，结果只保留整数部分
    取模（取余）：%
        特殊：只看被模数的正负号
        被模数%模数
    正好+
    负号-

    i++  ++i  i++先输出在自增   ++i，先自增，在输出
        对于自增变量本身来说，都会加1
        但是++在前还是在后，对于整个表达式的计算来说是不一样的。
        ++在前，先自增，然后取自增变量的值
        ++在后，先去变量的值，然后变量自增。
        但是不管怎么样，自增变量的取值与自增操作一前一后以钉是一起完成的
    i--  --i  i--先输出在自减   --i，先自减，在输出
        跟自增一样。
*/
public class Test05_Arithmetic {
  public static void main(String[] args){
      int x = 10;
      int y = 3;
      //System.out.println("x + y = "+ x + y);变为拼接
      System.out.println("x + y = "+ (x + y));
      System.out.println("x - y = "+ (x - y));
      System.out.println("x * y = "+ (x * y));
      System.out.println("x / y = "+ (x / y));

      System.out.println("5% 2  = "+ 5%2);
      System.out.println("-5%2  = "+ -5%2);
      System.out.println("5%-2  = "+ 5%-2);
      System.out.println("-5%-2 = "+ -5%-2);

      System.out.println("---------------------");
      int i = 1;
      System.out.println("i = "+ i++);

      int j = 1;
      System.out.println("j = "+ ++j);

      int q = 1;
      int p = ++q;
      System.out.println("q = "+ q);//2
      System.out.println("p = "+ p);//2

      int b=1;
      int c=2;
      int d=b++ + ++b + ++b * c++;
      /*

       */
      System.out.println("b = " +b);
      System.out.println("c = " +c);
      System.out.println("d = " +d);
  }
}
