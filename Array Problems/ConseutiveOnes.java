public class ConsequtiveOnes{
    public static void main(String[] args){
        int[] arr ={1,0,1,1,1,0,0,1,1,1,1,1,1,0,0,0,0};
        // System.out.println(maxConsequtiveZeros(arr));
        System.out.println(maxConsequtiveZeros_Optimized(arr));
    }
    // This is Naive Solution this algorithm takes O(n^2) time complexity
    public static int maxConsequtiveZeros(int[] arr){
        int result = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int curr = 0;
            for(int j=i;j<n;j++){
                if(arr[j] == 1){
                    curr++;
                }
                else {
                    break;
                }
            }
            result = Math.max(result,curr);
        }
        return result;
    }
    // This is the optimized solution for this problem which executes in O(n)
    public static int maxConsequtiveZeros_Optimized(int[]arr){
        int result=0;
        int curr = 0;       
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                curr = 0;
            }
            else{
                curr++;
                result = Math.max(result,curr);
            }
        }
        return result;
    }
}