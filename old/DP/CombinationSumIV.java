import java.util.* ;
import java.io.*; 
public class CombinationSumIV {
    public static int findWays(int num[], int tar) {
        // int[]dp=new int[tar+1];
        // for(int i=0;i<tar+1;i++) dp[i]=-1;
        return solve3(num, tar);
    }
    // recursion
    public static int solve1(int num[],int tar){
        if(tar==0)return 1;
        if(tar<0)return 0;
        int ans=0;
        for(int i=0;i<num.length;i++){
            ans += solve1(num,tar-num[i]);
        }
        return ans;
    }
    // memoization
    public static int solve2(int num[],int target,int[]dp){
        if(target==0)return 1;
        if(target<0)return 0;
        if(dp[target]!=-1)return dp[target];
        int ans=0;
        for(int i=0;i<num.length;i++){
            ans += solve1(num,target-num[i]);
        }
        dp[target]=ans;
        return dp[target];
    }
    // tabulation
    public static int solve3(int num[],int target){
        int[]dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++){
            for(int j=0;j<num.length;j++){
                int index = i-num[j];
                if(index >= 0)
                    dp[i] += dp[index];
            }
        
        }
        return dp[target];
    }
    
}