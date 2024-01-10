public class RecursiveFucntion {
    public static void main(String[] args){
        int result = sum(5);
        System.out.println(result);
        int result2 = rangeSum(2, 5);
        System.out.println(result2);
    }
    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }else {
            return 0;
        }
    }
    public static int rangeSum(int start, int end){
        if(end>start){
            return end + rangeSum(start, end-1);
        }else {
            return 0;
        }
    }
}
