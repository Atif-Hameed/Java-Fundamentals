import java.util.Scanner;

public class Patterns {
    public void rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dimension parallel : ");
        int x = sc.nextInt();
        System.out.print("Enter Dimension Vertical : ");
        int y = sc.nextInt();

        for(int i=1; i<=y; i++){
            for (int j=1; j<=x; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }


    public void hollowRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        System.out.print("Enter Columns : ");
        int c = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || j==1 || i==r || j==c){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public  void triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void reverseTriangle

    public static void main(String[] args){
        Patterns myObj = new Patterns();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice 1-Rectangle / 2-EmptyRectangle / 3-Triangle: ");
        int n = sc.nextInt();
        switch (n){
            case 1 :{
                myObj.rectangle();
                break;
            }
            case 2 :{
                myObj.hollowRectangle();
                break;
            }
            case 3 :{
                myObj.triangle();
                break;
            }
        }
    }
}
