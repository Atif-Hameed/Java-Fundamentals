public class RandmPractice {
    public static void main(String[] args){
        System.out.println("Hello world");
        RandmPractice obj = new RandmPractice();
        obj.mthd();
    }
    private void mthd(){
        System.out.println("this is not static method");
    }
    public  void usemthod(){
        RandmPractice obj2 = new RandmPractice();
        obj2.usemthod();
    }
}
