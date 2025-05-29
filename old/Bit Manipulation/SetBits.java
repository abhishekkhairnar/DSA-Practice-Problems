public class SetBits {
    public static void main(String[] args) {
        // System.out.println(countSetBits(25));
        System.out.println(powerOfTwo(32));
    }
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            int ans = n & 1;
            if(ans == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    // Brion Karningam's Algorithm
    public static int brion(int n){
        int count = 0;
        while(n > 0){
            n = n & n - 1;
            count++;
        }
        return count;
    }
    // use cases of Brion Karningam's Algorithm
    // Determine wheather the number is power of two or not
    // when any number is power of two then its binary representation should contain only one set bit
    public static boolean powerOfTwo(int n){
        int count = 0;
        while(n > 0){
            n = n & n-1;
            count++;
        }
        if(count == 1)
            return true;
        else
            return false;
    }
}
