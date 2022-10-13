public class ReverseDigits{
    public static void main(String[]args){
        System.out.println(palindrome(12321));
    }
    public static boolean palindrome(int n){
        return n == reverse2(n);
    }
    static int sum=0;
    public static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }


    // Second way of reversing digits of any number is first we will take a number n then we will find number of digits in it then we will have a helper function to find reverse of further number recursively

    public static int reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }


    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }

}