

public class Drangements {
	// long mod = 1000000007;
	public static long countDerangements(int n) {
		
		// return solve1(n);
		// long[]dp=new long[n+1];
		// for(int i=0;i<=n;i++)dp[i]=-1;
		// return solve2(n, dp);
		return solve4(n);
	}
	// Recursion
	public static long solve1(int n){
		long mod = 1000000007;
		// base case
		if(n==1) return 0;
		if(n==2) return 1;
		if(n==3) return 2;
		long ans =(  (	(n-1)%mod)*
					 (  (solve1(n-1)%mod) + 
						(solve1(n-2)%mod) )%mod
					);
		return ans;
	}
	// Recursion + Memoization
	public static long solve2(int n,long[]dp){
		// long mod = 1000000007;
		// base case
		if(n==1) return 0;
		if(n==2) return 1;
		if(n==3) return 2;
		if(dp[n] != -1) return dp[n];

		dp[n] =(  (	(n-1)%1000000007)*
					 (  (solve2(n-1,dp)%1000000007) + 
						(solve2(n-2,dp)%1000000007) )%1000000007
					);
		return dp[n];
	}
	// Tabulation
	public static long solve3(int n){
		long[]dp=new long[n+1];
		for(int i=0;i<=n;i++)dp[i]=0;
		dp[1] = 0;
		dp[2] = 1;
		for(int i=3;i<=n;i++){
			long first = dp[i-1]%1000000007;
			long second = dp[i-2]%1000000007;
			long sum = (first+second)%1000000007;
			long ans = ((i-1) * sum)%1000000007;
			dp[i] = ans;
		}
		return dp[n];
	}
	// Space optimization
	public static long solve4(int n){
		long prev2 = 0;
		long prev1 = 1;
		for(int i=3;i<=n;i++){
			long first = prev1%1000000007;
			long second = prev2%1000000007;
			long sum = (first+second)%1000000007;
			long ans = ((i-1) * sum)%1000000007;
			prev2 = prev1;
			prev1 = ans;
		}
		return prev1;
	}


}