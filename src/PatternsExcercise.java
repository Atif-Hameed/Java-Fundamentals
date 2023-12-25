import java.util.Scanner;

public class PatternsExcercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        boolean num = true;
        for (int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                if(num){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
                num = !num;
            }
            System.out.println();
        }
    }
}
