public class Test_Swap {
    public static void main(String[] args){
        int x = 1;
        int y = 2;

        /*
        通用得方案：适用于任意得数据类型
                   借助于第三个同样类型得临时变量
         */
        int c = y;//把y得值给了c， c=2
        System.out.println(c+y+x);
    }
}
