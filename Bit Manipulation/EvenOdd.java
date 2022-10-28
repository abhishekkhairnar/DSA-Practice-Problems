public class EvenOdd{
    public static void main(String[]args){
        int n=7;
        System.out.println(EvenOdd(n));
    }
    public static boolean EvenOdd(int n){
        return (n & 1)==1;
    }
}