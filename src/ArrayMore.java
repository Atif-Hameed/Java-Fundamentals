import java.util.*;
import java.util.Arrays;

public class ArrayMore {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of array : ");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter "+i+" nmber : ");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];

//for loop
        System.out.print("[");
        for(int i=0; i<n; i++){
            System.out.print(" "+array[i]+" ");
        }
        System.out.println("]");

//for each
        System.out.print("[");
        for(int i:array){
            System.out.print(" "+i+" ");
        }
        System.out.println("]");

//find Number
        for(int i=0; i<n; i++){
            if(array[i] == 2){
                System.out.print("Number Found at index : "+i);
                break;
            }
        }

//find max Number
        for(int i=0; i<n; i++){
            if(array[i] > max)
                max = array[i];
        }
        System.out.print("\nMax Number : "+max);

//find min Number
        for(int i=0; i<n; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.print("\nMin Number : "+min);
    }
}