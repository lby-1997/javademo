/*
运算符：
4，逻辑运算符
逻辑与：&
    类似于：且
    true & true 结果为true，必须两边都是对的才是对的
    true & false 结果为false
    false & true 结果为false
    false & false 结果为false
逻辑或：|
    类似于：或
    true & true 结果为true，两边有一个对的就是对的
    true & false 结果为true
    false & true 结果为true
    false & false 结果为false
逻辑非：！
    类似于：取反
     !true 结果为 false
     !false 结果为 true
逻辑异或：^

短路与：&&
短路或：||
 */
public class Test11_Logic {
    public static void main(String[] args){
        /*

         */
//        int score = 98;
//        if (70<=score & score<=100){
//            System.out.println("良好");
//        }
        int score = 11;
//        if (score<0 | score>100){
//            System.out.println("不对");
//        }
        if(!(score<0 | score>100)){
            System.out.println("取反");
        }
    }
}
