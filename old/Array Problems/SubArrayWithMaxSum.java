public class SubArrayWithMaxSum{
    public static void main(String[]args){
        // int[] arr = {8,-4,3,-5,4};
        // System.out.println(optimalsubarray(arr));
        int[]arr1 = {-1};
        System.out.println(normalMaxSum(arr1));
    }
    // here we have to find a subarray which have maximum sum considering all the possible circular subarrays
    public static int subarray(int[]arr){
        // This algorithm runs in O(n^2)
        int res = arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            int cmax = arr[i];
            int csum = arr[i];
            for(int j=1;j<n;j++){
                int index = (i+j)%n;
                csum += arr[index];
                cmax = Math.max(csum,cmax);
            }
            res = Math.max(res,cmax);
        }
        return res;
    }
    // Optimal Solution
    // To Solve this problem in O(n) time complexity we have to use kadane's algorithm algorithm is simple 
    public static int normalMaxSum(int[]arr){
    // first we will  take two variables and assign arr[0] in both
        int result = arr[0];
        int maxsum = arr[0];
        int n = arr.length;
    // secondly we will run a for loop from index 1 to n-1 in this loop we will store sum of every subarray and compare it with the value at current index and take maximum among them and store in maxsum and we will update the result to maximum among result itself and maxsum and store it in result
        for(int i=1;i<n;i++){
            maxsum = Math.max(arr[i],maxsum+arr[i]);
            result = Math.max(result,maxsum);
        }
        // System.out.println(result);
        return result;
    }
    

    public static int optimalsubarray(int[]arr){
        // we will find the maximum sum among all subarrays in arr and store it in normalsum variable
        
        int n = arr.length;
        int normalsum = normalMaxSum(arr);
        // if array contains all negative numbers then maximum sum previously we got from normalMaxSum function will be returned 
        if(normalsum < 0){
            return normalsum;
        }
        // the idea is that if we get the minimum sum among all subarrays that will be the middlemost part of which we can neglect and get the 
        int arrsum = 0;
        for(int i=0;i<n;i++){
            arrsum += arr[i];
            arr[i] = (-arr[i]);
        }
        int circularsum = arrsum + normalMaxSum(arr);   
        return Math.max(normalsum,circularsum);
    }
}