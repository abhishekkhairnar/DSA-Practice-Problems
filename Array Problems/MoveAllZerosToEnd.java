public class MoveAllZerosToEnd{
    public static void main(String args[]){
        int arr[] = {0,1,0,2,3,0,0,0};
        moveZeros(arr);
        // System.out.println(arr.toString());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // Time Complexity is O(n) and Auxillary Space is O(1)
    public static void moveZeros(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }
    }
    public static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}