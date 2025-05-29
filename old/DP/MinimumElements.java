public class MinimumElements{
    public static void main(String[] args) {
        int x = 7;
        int[]arr = new int[]{1,2,3};
        // int[]dp = new int[x+1];
        // for(int i=0;i<=x;i++) dp[i] = -1;
        // int ans = solve2(arr,x,dp);
        int ans = solve3(arr,x);
        if(ans == Integer.MAX_VALUE){
            System.out.println(Integer.MAX_VALUE);
        }
        else{
            System.out.println(ans);
        }
    }

    private static int solve3(int[] arr, int x) {
        int[]dp=new int[x+1];
        for(int i=0;i<=x;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i=1;i<=x;i++){
            for(int j=0;j<arr.length;i++){
                if(i-arr[j] >= 0 && dp[i-arr[j]] != Integer.MAX_VALUE)
                {
                    dp[i] = Math.min(dp[i],1+dp[i-arr[j]]);
                }
            }
        }
        
        return dp[x];
    }

    private static int solve2(int[]arr, int x,int dp[]){
        // base case
        if(x == 0){
            return 0;
        }
        if(x < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[x] != -1) {
            return dp[x];
        }
        int mini = Integer.MAX_VALUE;
        // logic
        for(int i=0;i<arr.length;i++){
            int ans = solve2(arr, x-arr[i],dp);
            if(ans != Integer.MAX_VALUE) 
            {
                mini = Math.min(mini, ans+1);
            }
        }
        dp[x] = mini;
        return mini;
    }

    // using recursion
    private static int solve1(int[] arr, int x) {
        // base case
        if(x == 0){
            return 0;
        }
        if(x < 0){
            return Integer.MAX_VALUE;
        }
        int mini = Integer.MAX_VALUE;
        // logic
        for(int i=0;i<arr.length;i++){
            int ans = solve1(arr, x-arr[i]);
            if(ans != Integer.MAX_VALUE) 
            {
                mini = Math.min(mini, ans+1);
            }
        }
        return mini;
    }
}