import java.util.Scanner;

public class arrayExcercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int mult=1;
        int max;
        int min;

        int[] myArray = new int[3];
        int len = myArray.length;
        for (int i = 0; i < len; i++) {
            System.out.print("Enter "+(i+1)+" : ");
            int num = sc.nextInt();
            myArray[i] = num;
        }

        System.out.print("[ ");
        for (int i=0 ;i<len;i++){
            System.out.print(myArray[i]+" ");
        }
        System.out.print(" ]");

        max = myArray[0];
        min = myArray[0];
        for (int i=0; i<len; i++){
            sum = myArray[i]+sum;
            mult = myArray[i]*mult;
            if(myArray[i]>max){
                max = myArray[i];
            }
            if(myArray[i]<min){
                min = myArray[i];
            }
        }

        System.out.print("\nReverse [ ");
        for (int i=len-1; i>=0; i--){
            System.out.print(myArray[i]+" ");
        }
        System.out.print("]");


        System.out.println("\nSUm : "+sum);
        System.out.println("Multiplication : "+mult);
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}