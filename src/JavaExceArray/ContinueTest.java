package JavaExceArray;
/*
berakhe和continue关键字的使用

break ：     switch-case  不同点，   相同点
             循环结构中，  结束当前循环

continue：  循环结构中，  结束当次循环
 */

public class ContinueTest {
    public static void main(String[] args) {
        for(int i = 1; i<= 10; i++){
            if(i % 4 == 0){
//                break;
                continue;
            }
            System.out.println(i);
        }
    }
}
