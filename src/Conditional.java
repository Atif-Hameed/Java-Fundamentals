import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Number is greater then Zero");
        } else if (number < 0) {
            System.out.println("Number is less then Zero");
        }else {
            System.out.println("Number is Zero");
        }
        int i = 0;
        while (i < 3) {
            System.out.print("Enter Your Age : ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("You are a Man");
            } else if (age >= 0 && age < 18) {
                System.out.println("You are a Kid");
            } else {
                System.out.println("Invalid input, App crashed...");
                break;
            }
            i++;
        }
        while (i < 3) {
            System.out.print("Enter a Random Number : ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Number is Even");
            } else if (num % 2 != 0) {
                System.out.println("Number is Odd");
            }
            i++;
        }
    }
}
