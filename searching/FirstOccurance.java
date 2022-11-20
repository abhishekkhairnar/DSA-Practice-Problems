public class FirstOccurance{
    public static void main(String[]args){
        int[]arr={1,2,3,3,3,5,7};
        System.out.println(last(arr,0,6,3,arr.length));
    }
    public static int last(int[]arr,int start,int end,int target,int n){
        if(end<start){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]>target){
            return last(arr,start,mid-1,target,n);
        }else if(arr[mid]<target){
            return last(arr,mid+1,end,target,n);
        }
        else{
            if(mid==n-1 || arr[mid]!=arr[mid+1]){
                return mid;
            }
            else{
                return last(arr,start,mid+1,target,n);
            }
        }       
    }
}