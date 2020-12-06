package JavaTestCasesExce;

public class ForExceCases {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
          for(int j=1; j<=7-i; j++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
