public class MinimumSum {

    public static void main(String[] args) {
        int n=3;
        int k=5;
        System.out.println(minimumSum(n,k));
    }
    public static int minimumSum(int n, int k) {
        int[]arr=new int[n];
        
        // k is 1 then
        if(k==1){
            for(int i=0;i<n;i++){
                arr[i]=i+1;
            }
            int arrsum=0;
            for(int i:arr)arrsum+=i;
            return arrsum;    
        }
        int ele=1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                //check if arr[i]+arr[j] != k
                if(arr[j] != 0 && i!=j && ele+arr[j] == k){
                    ele++;
                    j=-1;
                }
            }
            arr[i] = ele;
            ele++;
        }   
        int arrsum=0;
        for(int i:arr)arrsum+=i;
        return arrsum;
    }
}
