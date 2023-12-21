import java.util.Scanner;

public class Loops {
    public void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("For Loop OutPut for : " + i);
        }
    }

    public void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println("While Loop OutPut for : " + i);
            i++;
        }
    }

    public void doWhileLoop() {
        int i = 0;
        do {
            System.out.println("do While OutPut for : " + i);
            i++;
        } while (i < 10);
    }

    public void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the execution number : ");
        int num = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result = i + result;
        }
        System.out.println("Sum of first " + num + " are :" + result);
    }

    public void table() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for Table generation : ");
        int num = sc.nextInt();
        System.out.print("Enter the Range of Table : ");
        int range = sc.nextInt();
        for (int i = 1; i <= range; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
    }

    public void printEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the End point NUmber : ");
        int num = sc.nextInt();
        int sumOdd = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println("Print Even no. : " + i);
            } else if (i % 2 != 0) {
                sumOdd = i + sumOdd;
            }
        }
        System.out.print("Sum of Odd numbers : " + sumOdd);
    }

    public void problemStudent() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter 1 to start and 0 to stop : ");
        num = sc.nextInt();
        do {

            if (num == 1) {
                System.out.print("Enter marks : ");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.print("This is Excellent\n");
                } else if (89 >= marks && marks >= 60) {
                    System.out.print("This is better\n");
                } else if (marks <= 59 && marks > 0) {
                    System.out.print("Need improvement\n");
                } else if (marks == 0) {
                    System.out.println("App close...");
                    break;
                }
            } else if (num == 0) {
                System.out.println("App close...");
            } else {
                System.out.println("Error *** Invalid *** Input");
                break;
            }
        } while (num != 0);
    }


    public void checkPrime() {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("Wrong Input");
        } else {
            boolean isPrime = false;
            for (int i = 2; i <= 9; i++) {
                if(i == num){
                    continue;
                }
                if (num % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("This is Not a Prime Number");
            } else {
                System.out.println("Number is Prime");
            }
        }
    }

    public static void main(String[] args) {
        Loops myObj = new Loops();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select a Loop and hit Enter\n1-forLoop\n2-whileLoop\n3-doWhileLoop\n4-SolveProblem\n5-TableGenerate\n6-printEvenSumOdd\n7-StudentProblem\n8-checkPrime");
        int num = sc.nextInt();

        switch (num) {
            case 1: {
                myObj.forLoop();
                break;
            }
            case 2: {
                myObj.whileLoop();
                break;
            }
            case 3: {
                myObj.doWhileLoop();
                break;
            }
            case 4: {
                myObj.problem();
                break;
            }
            case 5: {
                myObj.table();
                break;
            }
            case 6: {
                myObj.printEven();
                break;
            }
            case 7: {
                myObj.problemStudent();
            }
            case 8: {
                myObj.checkPrime();
            }
        }
    }
}
