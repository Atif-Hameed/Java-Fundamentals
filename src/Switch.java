import java.util.Scanner;

public class Switch {
    public void switchMthd() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.print("Choose one number > 1/2/3 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("I am pakistani");
                    break;
                }
                case 2: {
                    System.out.println("I am Indian");
                    break;
                }
                case 3: {
                    System.out.println("I am Chinese");
                    break;
                }
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Switch myObj = new Switch();
        myObj.switchMthd();
    }
}
