public class BubbleSort{
    public static void main(String[]args){
        int[]arr={9,2,6,0};
        sort(arr,arr.length,0);
    }
    //bubble sort
    public static void sort(int[]arr,int r,int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            sort(arr,r,c+1);
        }
        else{
            sort(arr,r-1,0);
        }
    }
}