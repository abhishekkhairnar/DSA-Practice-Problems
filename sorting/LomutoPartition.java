import java.util.Arrays;
public class LomutoPartition{
    public static void main(String[]args){
        int [] arr = {3,2,1};
        lomuto(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void lomuto(int[]arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int i=low-1;
        int pivot = arr[high];
        for(int j=0;j<n;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,j,i);
            }
        }
        swap(arr,i+1,high);
    }
    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}