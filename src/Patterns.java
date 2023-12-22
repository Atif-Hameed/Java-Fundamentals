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


    public void reverseTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void rightTriange(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for (int i=1; i<=r; i++){
            for(int j=1; j<= r-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void numberTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public void reverseNmberTrianlge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns myObj = new Patterns();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice : \n1-Rectangle : \n2-EmptyRectangle : \n3-Triangle : \n4-ReverseTrianle : \n5-rightTriangle : \n6-numberTriangle : \n7-reverseNumberTriangle :");
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
            case 4 :{
                myObj.reverseTriangle();
                break;
            }
            case 5 :{
                myObj.rightTriange();
                break;
            }
            case 6 :{
                myObj.numberTriangle();
                break;
            }
            case 7 :{
                myObj.reverseNmberTrianlge();
                break;
            }
        }
    }
}
