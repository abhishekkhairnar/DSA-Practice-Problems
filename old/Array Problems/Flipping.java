// The problem is simple we have given a array of booleans we have to find the minimum flips required to get all the elements of array same you can either flip 0s or 1s
public class Flipping{
    public static void main(String[]args){
        int[] arr = {1,0,0,1,0,0,1};
        flipping(arr);
    }
    public static void flipping(int[]arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.print("From "+i+" to");
                }
                else{
                    System.out.println(i-1);
                }
            }
        }
        if(arr[n-1] != arr[0]){
            System.out.println(n-1);
        }
    }
}

// difference between number of groups of 0s and 1s can be either 0 or 1 so if the array's starting and ending elements are same then difference is 1 else if array's starting and ending elements are not same then difference is 0 