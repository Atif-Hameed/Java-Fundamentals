import java.util.Scanner;

public class FunctionExcercise {

    public void checkPrime(int n){
       int check = 0;
       boolean prime = false;
        if (n<=1){
            System.out.print("Wrong Entry...");
        }else{
            for(int i=2; i<=9; i++){
                if(n==i){
                    continue;
                }
                check = n%i;
                if(check == 0){
                    prime = true;
                }
            }
            if(prime){
                System.out.print(n + " is Not a Prime Number");
            }else{
                System.out.print(n + " is a Prime Number");
            }
        }
    }

    public void checkEvnOdd(int n){
        int check = 0;
        check = n%2;
        if(check ==0){
            System.out.print(n+" is Even Number");
        }else{
            System.out.print(n + " is Odd Number");
        }
    }

    public  void Table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FunctionExcercise myObj = new FunctionExcercise();
        myObj.checkPrime(n);
        System.out.println();
        myObj.checkEvnOdd(n);
        System.out.println();
        System.out.print("Do You want to print table of "+n+" y/n ?");
        String choose = sc.next();
        if(choose.equals("y")){
            myObj.Table(n);
        }else{
            System.out.print("Thank You...");
        }
    }
}
