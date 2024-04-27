import java.util.Scanner;

public class functions {

    public void factorial(){
        System.out.print("Enter the desired Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        if(n<0){
            System.out.print("Wrong input, facotrial not possible");
        }else{
            for (int i=n; i>=1; i--){
                factorial = factorial*i;
            }
            System.out.print("Facotorial : "+factorial);
        }
    }
    public static void main(String[] args){
        functions myObj = new functions();
        myObj.factorial();
        int result = myObj.sumNumbers(99999);
        System.out.println("Sum of N numbers : "+result);
    }

    public int sumNumbers(int n){
        return n*(n+1)/2;
    }
}
