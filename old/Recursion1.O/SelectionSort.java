public class SelectionSort{
    public static void main(String[]args){
        int[]arr={9,2,6,0};
        selectionSort(arr,arr.length,0,0);
    }
    //selection sort
    public static void selectionSort(int[]arr,int r,int c,int max){
        if( r == 0 ){
            return;
        }
        if( r > c ){
            if(arr[c] > arr[max]){
                selectionSort(arr,r,c+1,c);
            }
            else{
                selectionSort(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr,r-1,0,0);
        }
    }
}