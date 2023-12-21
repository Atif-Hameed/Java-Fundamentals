import java.util.Scanner;

public class Patterns {
    public void pattern1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dimension parallel : ");
        int x = sc.nextInt();
        System.out.print("Enter Dimension Vertical : ");
        int y = sc.nextInt();

        for(int i=1; i<=y; i++){
            System.out.print("*");
            for (int j=1; j<x; j++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Patterns myObj = new Patterns();
        myObj.pattern1();
    }
}
