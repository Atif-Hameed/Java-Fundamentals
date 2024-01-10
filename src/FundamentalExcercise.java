//Questions
/*  Enter 3 numbers from the user & make a function to print their average.
    Write a function to print the sum of all odd numbers from 1 to n.
    Write a function which takes in 2 numbers and returns the greater of those two.
    Write a function that takes in the radius as input and returns the circumference of a circle.
    Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    Write an infinite loop using do while condition.
    Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
    Write a program to print Fibonacci series of n terms where n is input by user :
    0 1 1 2 3 5 8 13 21 .....
    In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
*/


import java.util.Scanner;

public class FundamentalExcercise {

    public void q1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();

        int avg = (n1 + n2 + n3) / 3;

        System.out.print("Average of Numbers : " + avg);
    }

    public void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            result = i + result;
        }
        System.out.print("Sum of Odd Numbers till " + n + " : " + result);
    }

    public void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();
        int max = 0;
        int min = 0;
        if (n3 >= n2 && n2 >= n1) {
            max = n3;
            min = n1;
        } else if (n2 >= n1 && n1 >= n3) {
            max = n2;
            min = n3;
        } else if (n1 >= n3 && n3 >= n2) {
            max = n1;
            min = n2;
        } else {
            System.out.print("wrong input...");
        }
        System.out.print("Max Number : " + max + "\nMin Number : " + min);
    }

    public void q4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        float r = sc.nextFloat();
        double circum = 2 * 3.14 * r;
        System.out.print("Circumference of Circle : " + circum);
    }

    public void q5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if(age>18){
            System.out.print("Eligible for vote");
        }else {
            System.out.print("Not Eligible for vote");
        }
    }

    public void q6(){
        boolean infinit = true;
        do {
            System.out.println("Infinit Loooop...");
        }while (infinit);
    }

    public void q7(){
        Scanner sc = new Scanner(System.in);
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        int count = 0;
        System.out.print("Enter range : ");
        int choice = sc.nextInt();
        do {
            System.out.print("Enter Number : ");
            double n = sc.nextInt();
            if(n>0){
                posCount++;
            }else if(n<0){
                negCount++;
            }else {
                zeroCount++;
            }
            count ++;
        }while (choice != count);
        System.out.print("Positive Count : "+posCount+"\nNegative Count : "+negCount+"\nZero Count : "+zeroCount);
    }

    public void q8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        int result = 1;
        for(int i=1; i<=n2; i++){
            result = result*n1;
        }
        System.out.print("Answer : "+result);
    }

    public static void main(String[] args) {
        FundamentalExcercise obj = new FundamentalExcercise();
        System.out.print("Enter Question Number\nQuestion 1 : \nQuestion 2 : \nQuestion 3 : \nQuestion 4 : \nQuestion 5 : \nQuestion 6 (Infinit Loop): \nQuestion 7 : \nQuestion 8 : ");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                obj.q1();
            case 2:
                obj.q2();
            case 3:
                obj.q3();
            case 4:
                obj.q4();
            case 5:
                obj.q5();
            case 6:
                obj.q6();
            case 7:
                obj.q7();
            case 8:
                obj.q8();
        }
    }

}
