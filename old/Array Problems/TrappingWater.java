public class TrappingWater{
    public static void main(String[] args){
        int[] arr = {1,2,3,1,3,2,1};
        // System.out.println(TrapWater_NaiveSolution(arr));
        System.out.println(Trapwater_OptimumSolution(arr));
    }
    // Time Complexity of this algorithm is O(n)
    // Auxillary Space is O(n)
    public static int Trapwater_OptimumSolution(int[] arr){
        int res = 0;
        int n = arr.length;
        int[] lmax;
        int[] rmax;
        lmax = new int[n];
        rmax = new int[n];
        lmax[0] = arr[0];
        rmax[n-1] = arr[n-1];
        for(int i=1;i<n;i++){
            lmax[i] = max(arr[i],lmax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rmax[i] = max(arr[i],rmax[i+1]);
        }
        for(int i=1;i<n-1;i++){
            res += min(lmax[i],rmax[i]) - arr[i];
        }
        return res;
    }
    // Time complexity is O(n^2)
    public static int TrapWater_NaiveSolution(int[]arr){
        int res = 0;
        int n = arr.length;
        for(int i=1;i<n-1;i++){
            int lmax = arr[i];
            for(int j=0;j<i;j++){
                lmax = max(lmax,arr[j]);
            }
            int rmax = arr[i];
            for(int j=i+1;j<n;j++){
                rmax = max(rmax,arr[j]);
            }
            res = res + min(lmax,rmax)-arr[i];
        }
        return res;
    }
    public static int max(int a,int b){
        if(a>=b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int min(int a,int b){
        if(a<=b){
            return a;
        }
        else 
        {
            return b;
        }
    }
}