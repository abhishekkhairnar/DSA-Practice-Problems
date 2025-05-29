public class NBonacci{
    public static void main(String[]args){
        fibonacci(4,10);
    }
    public static void fibonacci(int n,int m){
        int[]arr;
        arr = new int[10];

        for(int i=0;i<n;i++){
            if(i==n-1){
                arr[i] = 1;
            }
            else
            {
                arr[i] = 0;
            }
        }
        int sum = 1;
        for(int i=4;i<m;i++){
            arr[i] = sum - arr[(i-n)];
            sum += arr[i];
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}