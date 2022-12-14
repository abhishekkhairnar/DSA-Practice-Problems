import java.util.Arrays;
public class HoaresPartition{
    public static void main(String[]args){
        int [] arr = {5,9,2,8,3,7};
        hoare(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int hoare(int[]arr){
        int i= -1;
        int j=arr.length;
        int pivot = arr[0];
        while(true){
            do{
                i++;
            }while(arr[i] < pivot);
            do{
                j--;
            }while(arr[j] > pivot);
            if(i >= j){
                return j;
            }
            swap(arr,i,j);
        }   
    }
    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}