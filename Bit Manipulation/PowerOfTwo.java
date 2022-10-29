// We are given a number n we have to find weather it is power of 2 or not
public class PowerOfTwo{
    public static void main (String[]args){ 
        int n=2;
        System.out.println(efficient(n));
    }
    public static boolean powerOfTwoNaive(int n){
        if(n==0)return false;
        while(n!=0){
            if((n%2)!=0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
    public static boolean efficient(int n){
        if(n==0)return false;
        int temp = n-1;
        if((n & temp)==0){
            return true;
        }else{
            return false;
        }
    }
}