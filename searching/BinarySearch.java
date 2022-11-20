public class BinarySearch{
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        System.out.println(binarysearch(arr,3));
    }
    public static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<end){
            if(arr[mid]>target){
                end = mid-1; 
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}