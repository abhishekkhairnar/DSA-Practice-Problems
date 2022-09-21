public class MaxDiff{
    public static void main(String[] args){
        int arr[] = {4,2,8};
        System.out.println(maxxdiff(arr));

    }


    // complexity is O(n^2)
    public static int maxdiff(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(max < (arr[j] - arr[i])){
                    max = arr[j] - arr[i];
                }
            }
        }
        return max;
    }
    // Optimized Solution
    // Time Complexity = O(n)
    public static int maxxdiff(int[] arr){
        int res = arr[1] - arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            res = max((res),(arr[i]-min));
            min = min(min,arr[i]);
        }
        return res;
    }

    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int min(int a,int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
}