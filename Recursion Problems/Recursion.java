public class Recursion{
    public static void main(String[]args){
        System.out.println(sumOfDigits(255));
    }
    // This is problem to find sum of digits in a number n
    public static int sumOfDigits(int n){
        // Base Case
        if(n<10){
            return n;
        }
        // Recursive Call 
        return sumOfDigits(n/10)+n%10;
    }
}