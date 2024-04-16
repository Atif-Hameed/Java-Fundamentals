import java.util.*;

public class Main {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 1st Number : ");
       int a = sc.nextInt();
       System.out.print("Enter 2nd Number : ");
       int b = sc.nextInt();
       int sum = a + b;
       System.out.println("The Sum of Numbers : "+sum);
       Main object = new Main();
       object.RandomFucntion();
   }

   public void RandomFucntion(){
       Scanner sc = new Scanner(System.in);
       System.out.println("What is your name ?");
       String name = sc.nextLine();
       System.out.println("Your name is : "+name);
   }
}