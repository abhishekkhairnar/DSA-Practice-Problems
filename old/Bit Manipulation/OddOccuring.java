public class OddOccuring {
    public static void main(String[] args) {
        int[]arr = {1,3,4,5,6,7};
        System.out.println(missing(arr));
    }
    // if we exor all of the elements in any array we will get number occuring odd no of times
    public static int oddOccuring(int[]arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
    // this technique can also be used when we are given an array containing elements from 1 to n+1 and we are told to find out missing number in array
    public static int missing(int[]arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
