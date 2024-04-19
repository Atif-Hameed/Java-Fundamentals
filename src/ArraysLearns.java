import java.util.Scanner;

public class ArraysLearns {
    public static void main(String[] args){
        String[] myArray = {"A","T","I","F"};
        System.out.print("[ ");
        for (int i =0; i<4; i++){
            System.out.print(myArray[i]+" ");
        }
        System.out.print("]");

        int[] sampArray = {1,2,3,4};
        System.out.print("[ ");
        for (int i=0; i<sampArray.length; i++){
            System.out.print(sampArray[i]+" ");
        }
        System.out.print("]");

        int[] test = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<test.length; i++){
            System.out.println("Enter number "+ (i+1) +": ");
            int num = sc.nextInt();
            test[i] = num;
        }
        System.out.print("[ ");
        for (int i=0; i<test.length; i++){
            System.out.print(test[i]+ " ");
        }
        System.out.print(" ]");

    }
}
