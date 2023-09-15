
// import com.sun.org.apache.bcel.internal.generic.INEG;

public class CutIntoSegments {
    public static int cutSegments(int n, int x, int y, int z) {
        // int[]dp=new int[n+1];
        // for(int i=0;i<=n;i++) dp[i] = Integer.MIN_VALUE;
        // int ans = solve2(n,x,y,z,dp); 
        // if(ans < 0){
        //     return 0;
        // }
        // else{
        //     return ans;
        // }
        return solve3(n, x, y, z);
    }
    // Recursion
    public static int solve1(int n,int x,int y,int z){
        // base condition
        if(n == 0) return 0;
        if(n < 0) return Integer.MIN_VALUE;
        int a = solve1(n-x,x,y,z) + 1;
        int b = solve1(n-y,x,y,z) + 1;
        int c = solve1(n-z,x,y,z) + 1;
        return Math.max(a,Math.max(b,c));
    }
    // Memoization
    public static int solve2(int n,int x,int y,int z,int[]dp){
        // base condition
        if(n == 0) return 0;
        if(n < 0) return Integer.MIN_VALUE;
        if(dp[n]!=Integer.MIN_VALUE) return dp[n];
        int a = solve2(n-x,x,y,z,dp) + 1;
        int b = solve2(n-y,x,y,z,dp) + 1;
        int c = solve2(n-z,x,y,z,dp) + 1;
        dp[n] = Math.max(a, Math.max(b,c));
        return dp[n];
    }
    // Tabulation
    public static int solve3(int n,int x,int y,int z){
        // base condition
        int[]dp=new int[n+1];
        for(int i=0;i<=n;i++) dp[i] = Integer.MIN_VALUE;
        dp[0] = 0;

        for(int i=1;i<=n;i++){
            if(i-x >= 0){
                dp[i] = Math.max(dp[i],dp[i-x]+1);
            }
            if(i-y >= 0){
                dp[i] = Math.max(dp[i],dp[i-y]+1);
            }
            if(i-z >= 0){
                dp[i] = Math.max(dp[i],dp[i-z]+1);
            }
        }
        
        if(dp[n] < 0) return 0;
        return dp[n];
    }
}