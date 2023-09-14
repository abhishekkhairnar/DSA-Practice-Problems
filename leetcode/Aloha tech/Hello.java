import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int s = sc.nextInt();
        System.out.println(getcount(s));
    }
    private static int getcount(int s) {
        int count=0;
        if(s < 9){
            return 1;
        }
        while(s > 0){
            s /= 10;
            count++;
        }
        return count;
    }
 public static String reverse(String s ){
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        String ans = new String(arr);
        return ans;
    }
}