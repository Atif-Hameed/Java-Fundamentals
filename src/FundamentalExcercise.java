import java.util.Scanner;

public class FundamentalExcercise {

    public void q1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();

        int avg = (n1+n2+n3)/3;

        System.out.print("Average of Numbers : "+avg);
    }

    public void q2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int result = 0;
        for (int i=1; i<=n; i++){
            if(i%2 == 0){
                continue;
            }
            result = i+result;
        }
        System.out.print("Sum of Odd Numbers till "+n+" : "+result);
    }

    public void q3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();
        int max=0;
        int min=0;
        if(n3>n2 && (n2>n1 || n2==n1)){
            max = n3;
            min = n1;
        }else if(n2>n1 && (n1>n3 || n1==n3)){
            max = n2;
            min = n3;
        } else if (n1>n3 && (n3>n2 || n3==n2)) {
            max = n1;
            min = n2;
        }else {
            System.out.print("All Numbers are same");
        }
        System.out.print("Max Number : "+max+"\nMin Number : "+min);
    }

    public static void main(String[] args){
        FundamentalExcercise obj = new FundamentalExcercise();
        System.out.print("Enter Question Number\nQuestion 1 : \nQuestion 2 : \nQuestion 3 : ");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                obj.q1();
            case 2:
                obj.q2();
            case 3:
                obj.q3();
        }
    }

}
