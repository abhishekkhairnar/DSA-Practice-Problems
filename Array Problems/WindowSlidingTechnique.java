// Problem Description
// we have given a array and a integer k we have to find the maximum sum of k consequtive elements
public class WindowSlidingTechnique{
    public static void main(String[]args){
        int[]arr = {1,4,20,3,10,5};
        int k = 3;
        System.out.println(windowslidilg(arr,k));
    }
    public static int naiveSolution(int[]arr,int k){
        int n = arr.length;
        int sum=0;
        for(int i=0;i<=n-k;i++){
            int cur_sum = arr[i];
            for(int j=i+1;j<k+i;j++){
                cur_sum += arr[j];
            }
            sum = Math.max(cur_sum,sum);
        }
        return sum;
    }
    public static int windowslidilg(int[]arr,int k){
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int cur_sum = sum;
        for(int i=k;i<n;i++){
            cur_sum += (arr[i] - arr[i-k]);
            sum = Math.max(cur_sum,sum);
        }
        return sum;
    }
}