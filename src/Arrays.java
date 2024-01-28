import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] sampleArray = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            sampleArray[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        for (int i=0; i<n; i++){
            System.out.print(sampleArray[i]+" ");
        }
        System.out.print("\nElement to find : ");
        int num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(num == sampleArray[i]){
                System.out.print("Index of "+num+" is : "+i);
                break;
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(max < sampleArray[i]){
                max = sampleArray[i];
            }
            if(min > sampleArray[i]){
                min = sampleArray[i];
            }
        }
        System.out.print("\nMax number : "+max+"\nMin number : "+min);
    }
}
