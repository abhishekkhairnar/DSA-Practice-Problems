import java.util.* ;
import java.io.*; 
import java.util.*;
public class MaximumSumOfNonAdj {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// int x = nums.size();
		// int dp[] = new int[x];
		// for(int i=0;i<x;i++) dp[i] = -1;
	
		// return solve2(nums,x-1,dp);
		return solve4(nums);
	}
	// Recursion
	public static int solve1(ArrayList<Integer> num,int x){
		// base case
		if(x < 0) return 0;
		if(x == 0) return num.get(0);
		int incl = solve1(num,x-2) + num.get(x);
		int excl = solve1(num,x-1) + 0;
		return Math.max(incl, excl);
	}
	// Memoization
	public static int solve2(ArrayList<Integer> num,int x,int[]dp){
		// base case
		if(x < 0) return 0;
		if(x == 0) return num.get(0);
		if(dp[x] != -1) return dp[x];
		int incl = solve1(num,x-2) + num.get(x);
		int excl = solve1(num,x-1) + 0;
		dp[x] = Math.max(incl, excl);
		return dp[x];
	}
	// Tabulation
	public static int solve3(ArrayList<Integer> num){
		int x = num.size();
		if(x <=2)return Math.max(num.get(x-1),num.get(0));
		int[]dp=new int[x];
		dp[x-1] = num.get(x-1);
		dp[x-2] = Math.max(num.get(x-1),num.get(x-2));

		for(int i=x-3;i>=0;i--){
			int incl = dp[i+2] + num.get(i);
			int excl = dp[i+1] + 0;
			dp[i] = Math.max(incl, excl);
		}
		return dp[0];
	}
	public static int solve4(ArrayList<Integer> num){
		int x = num.size();
		if(x<=2) return Math.max(num.get(x-1),num.get(0));
		int plusone = Math.max(num.get(x-1),num.get(x-2));
		int plustwo = num.get(x-1);

		for(int i=x-3;i>=0;i--){
			int ans = Math.max(plusone,num.get(i)+plustwo);
			plustwo = plusone;
			plusone = ans;
		}
		return plusone;


	}
}