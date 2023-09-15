
import java.util.* ;
import java.io.*; 
public class PaintingFenceAlgorithm {
	public static int numberOfWays(int n, int k) {
		// int[]dp=new int[n+1];
		// for(int i=0;i<=n;i++)dp[i]=-1;
		return solve4(n,k);
	}
	// Recursion
	public static int solve1(int n,int k){
		// base case
		if(n==1) return k;
		if(n==2) return add(k,mul(k,(k-1)));
		int ans = add( mul(solve1(n-2,k),(k-1)),mul(solve1(n-1,k),(k-1)));
		return ans;
	}
	// Recursion + Memoization
	public static int solve2(int n,int k,int[]dp){
		// base case
		if(n==1) return k;
		if(n==2) return add(k,mul(k,(k-1)));
		if(dp[n]!=-1)return dp[n];
		dp[n] = add( mul(solve2(n-2,k,dp),(k-1)),mul(solve2(n-1,k,dp),(k-1)));
		return dp[n];
	}
	// Tabulation
	public static int solve3(int n,int k){
		if(n==1)return k;
		int[]dp=new int[n+1];
		for(int i=0;i<=n;i++)dp[i]=-1;
		dp[1]=k;
		dp[2]=add(k,mul(k,(k-1)));
		for(int i=3;i<=n;i++){
			dp[i] = add(mul(dp[i-2],(k-1)),mul(dp[i-1],(k-1)));
		}
		return dp[n];
	}
	// Space Optimization
	public static int solve4(int n,int k){
		// if(n==1)return k;
		// int[]dp=new int[n+1];
		// for(int i=0;i<=n;i++)dp[i]=-1;
		int prev2=k;
		int prev1=add(k,mul(k,(k-1)));
		for(int i=3;i<=n;i++){
			int ans = add(mul(prev2,(k-1)),mul(prev1,(k-1)));
			prev2 = prev1;
			prev1 = ans;
		}
		return prev1;
	}
	public static int add(int a,int b){
		return ((a%1000000007)+(b%1000000007));
	}
	public static int mul(int a,int b){
		return ((a%1000000007) *(b%1000000007));
	}
}