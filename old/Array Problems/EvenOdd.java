// Maximum length of Even Odd alternating subarray
public class EvenOdd{
    public static void main(String[]args){
        int[] arr = {1,2,3,4,2,1,6,7,8,9};
        System.out.println(maxSubArray_Optimized(arr));
    }
    public static int maxSubArray_Optimized(int[]arr){
        int res = 1;
        int current = 1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]%2 == 0 && arr[i-1]%2 != 0) || (arr[i]%2 != 0 &&arr[i-1]%2 == 0)){
                current++;
                res = Math.max(res,current);
            }
            else {
                current = 1;
            }
        }
        return res;
    }
    public static int maxSubArray(int[]arr){
        int res=1;
        for(int i=0;i<arr.length;i++){
            int curr = 1;
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]%2 == 0 && arr[j-1]%2 != 0) || (arr[j]%2 != 0 &&arr[j-1]%2 == 0)){
                    curr++;
                }
                else{
                    break;
                }
            }
            res = Math.max(res,curr);
        }
        return res;
    }
}