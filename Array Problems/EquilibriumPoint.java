public class EquilibriumPoint{
    public static void main(String[]args){
        int[]arr = {3,4,8,-9,20,6};
        System.out.println(EquPoint(arr));
    }
    public static boolean EquPoint(int[]arr){
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            if(leftSum == sum-arr[i]){
                System.out.println(arr[i]);
                return true;
            }
            else{
                leftSum += arr[i];
                sum -= arr[i];
            }
        }
        return false;
    }
}