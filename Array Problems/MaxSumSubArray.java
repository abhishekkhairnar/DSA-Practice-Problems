public class MaxSumSubArray{
    public static void main(String[]args){
        int[] arr = {-3,8,-2,4,-5,6};
        // System.out.println(maxSum(arr));
        System.out.println(max_SumOfSubArray(arr));
    }
    // Time Complexity of this solution is O(n) and auxillary space is O(1)
    public static int max_SumOfSubArray(int[]arr){
        int res=arr[0];
        int N = arr.length;
        int maxend = arr[0];
        for(int i=1;i<N;i++){
            maxend = Math.max((maxend+arr[i]),arr[i]);
            res = Math.max(maxend,res);
        }
        return res;
    }
    // time Complexity if this solution is O(n^2) and auxillary space is O(1)
    public static int maxSum(int[]arr){
        int res = arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            int curr = 0;
            for(int j=i;j<n;j++){
                curr += arr[i];
                res = Math.max(curr,res);
            }
        }
        return res;
    }
}