class GetMinimumSquares
{
    public int MinSquares(int n)
    {
        return solve3(n);
    }
    public int solve1(int n){
        if(n==0)
            return 0;
        
        int ans=n;
        for(int i=1;i*i<n;i++){
            ans = Math.min(ans,1+solve1(n-i*i));
        }
        return ans;
    }
    public int solve2(int n,int dp[]){
        if(n==0)
            return 0;
        if(dp[n]!=-1)return dp[n];
        int ans=n;
        for(int i=1;i*i<=n;i++){
            ans = Math.min(ans,1+solve2(n-i*i,dp));
        }
        dp[n]=ans;
        return dp[n];
    }
    //tabulation
    public int solve3(int n){
        if(n==0)return 0;
        int[]dp=new int[n+1];
        for(int i=0;i<=n;i++)dp[i]=Integer.MAX_VALUE;
        dp[0]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=n;j++){
                if(i-j*j>=0)
                    dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}