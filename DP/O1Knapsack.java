import java.util.* ;
import java.io.*; 

public class O1Knapsack{
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        // int[][]dp=new int[n][maxWeight+1];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=maxWeight;j++){
        //         dp[i][j] = -1;
        //     }
        // }
        return solve4(weight, value, n, maxWeight);
    }
    // Recursion
    static int solve1(int[] weight, int[] value, int index, int capacity){
        // base case
        if(index == 0){
            if(weight[0] <= capacity){
                return value[0];
            }
            else{
                return 0;
            }
        }
        int include=0;
        if(weight[index] <= capacity){
            include = solve1(weight, value, index-1, capacity-weight[index]) + value[index];
        }
        int exclude = solve1(weight, value, index-1, capacity);
        int ans = Math.max(include,exclude);
        return ans;
    }
    // Recursion + Memoization
    static int solve2(int[] weight, int[] value, int index, int capacity,int[][]dp){
        // base case
        if(index == 0){
            if(weight[0] <= capacity){
                return value[0];
            }
            else{
                return 0;
            }
        }
        if(dp[index][capacity] != -1) return dp[index][capacity];
        int include=0;
        if(weight[index] <= capacity){
            include = solve2(weight, value, index-1, capacity-weight[index],dp) + value[index];
        }
        int exclude = solve2(weight, value, index-1, capacity,dp);
        dp[index][capacity] = Math.max(include,exclude);
        return dp[index][capacity];
    }
    // Tabulation
    static int solve3(int[] weight, int[] value, int n, int capacity){
        // step:01 create dp array
        int[][]dp=new int[n][capacity+1];
        
        // step:02 Analyze base cases
        for(int i=weight[0];i<=capacity;i++){
            if(weight[0] <= capacity){
                dp[0][i] = value[0];
            }
            else{
                dp[0][i] = 0;
            }
        }
        // step:03 
        for(int index=1;index<n;index++){
            for(int w=0;w<=capacity;w++){
                
                int include=0;

                if(weight[index] <= w){
                    include = dp[index-1][w-weight[index]]  + value[index];
                }
                int exclude =0+ dp[index-1][w];
                dp[index][w] = Math.max(include,exclude);
            }
        }
        return dp[n-1][capacity];
    }
    // space optimization
    static int solve4(int[] weight, int[] value, int n, int capacity){
        // step:01 create dp array
        int[]prev=new int[capacity+1];
        int[]curr=new int[capacity+1];
        
        // step:02 Analyze base cases
        for(int w=weight[0];w<=capacity;w++){
            if(weight[0] <= capacity){
                prev[w] = value[0];
            }
            else{
                prev[w] = 0;
            }
        }
        // step:03 
        for(int index=1;index<n;index++){
            for(int w=0;w<=capacity;w++){
                
                int include=0;

                if(weight[index] <= w){
                    include = prev[w-weight[index]]  + value[index];
                }
                int exclude =0+ prev[w];
                curr[w] = Math.max(include,exclude);
            }
            prev = curr;
        }
        return prev[capacity];
    }

}