import java.util.Scanner;

public class arrayExcercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int mult = 1;
        int max;
        int min;

        System.out.print("Enter Array length : ");
        int len = sc.nextInt();
        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + (i + 1) + " : ");
            int num = sc.nextInt();
            myArray[i] = num;
        }

        System.out.print("[ ");
        for (int i = 0; i < len; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.print(" ]");

        max = myArray[0];
        min = myArray[0];
        for (int i = 0; i < len; i++) {
            sum = myArray[i] + sum;
            mult = myArray[i] * mult;
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        //[3,5,6,2,1,6]
        boolean sort = true;
        for (int i = len - 1; i > 0; i--) {
            if (myArray[i] < myArray[i - 1]) {
                sort = false;
                break;
            }
        }
        if (sort) {
            System.out.println("Array sorted");
        } else {
            System.out.println("Array not sorted");
        }

        boolean dublicate = false;
        int evn = 0;
        int odd = 0;

        for (int i = 0; i < len - 1; i++) {
            if (myArray[i] == myArray[i + 1]) {
                dublicate = true;
                break;
            }
        }
        if (dublicate == true) {
            System.out.println("Array contain dublication");
        } else {
            System.out.println("Array not contain any dublication");
        }

        int[] evenArray=new int[len];
        int[] oddArray = new int[len];

        for (int i = 0; i < len; i++) {
            if (myArray[i] % 2 == 0) {
                evn++;
                evenArray[i] = myArray[i];
            } else {
                odd++;
                oddArray[i] = myArray[i];
            }
        }

          //print even elemts
        System.out.print("Even Elements : [ ");
        for (int i=0; i<evenArray.length; i++){
            System.out.print(evenArray[i]+" ");
        }
        System.out.print(" ]");

        //print odd elements
        System.out.print("Odd Elements : [ ");
        for (int i=0; i<oddArray.length; i++){
            System.out.print(oddArray[i]+" ");
        }
        System.out.print(" ]");

        System.out.println("\nEven : " + evn);
        System.out.println("Odd : " + odd);

        System.out.print("\nReverse [ ");
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.print("]");

        System.out.println("\nSUm : " + sum);
        System.out.println("Multiplication : " + mult);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}