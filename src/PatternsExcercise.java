import java.util.Scanner;

public class PatternsExcercise {

    public void rhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for (int i=1; i<=r; i++){
            for (int j=i; j<r; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=r; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void hollowRhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for (int i=1; i<=r; i++){
            for (int j=i; j<r; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=r; k++){
                if(k==1 || k==r || i==1 || i==r){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for (int i=1; i<=r; i++){
           for (int j=i; j<r; j++){
               System.out.print(" ");
           }
           for (int k=1; k<=i; k++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }


    public void reversePyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for (int i=1; i<=r; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=i; k<=r; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        PatternsExcercise myObj = new PatternsExcercise();
        Scanner sc = new Scanner(System.in);
        System.out.print("1-Rhombus : \n2-HollowRohmbus : \n3-Pyramid : \n4-ReversePyramid : ");
        int n = sc.nextInt();
        switch (n){
            case 1:{
                myObj.rhombus();
                break;
            }
            case 2:{
                myObj.hollowRhombus();
                break;
            }
            case 3:{
                myObj.pyramid();
                break;
            }
            case 4:{
                myObj.reversePyramid();
                break;
            }
        }
    }
}
