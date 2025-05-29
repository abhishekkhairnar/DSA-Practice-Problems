import java.util.Arrays;

public class PivotPartition{
    public static void main(String[]args){
        int[]arr={3,9,1,5,8,4,7};
        pivotPartition(arr,0,6,4);
        System.out.println(Arrays.toString(arr));
    }
    // Naive Solution
    public static void pivotPartition(int[]arr,int low,int high,int pivot){
        int[]temp = new int[high-low+1];
        int index=0;
        for(int i=low;i<=high;i++){
            if(arr[i]<=arr[pivot]){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=low;i<high;i++){
            if(arr[i]>arr[pivot]){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];
        }
    }
}