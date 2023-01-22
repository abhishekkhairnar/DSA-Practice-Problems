public class LinearSearch{
    public static void main(String[]args){
        int[]arr={1,54,23,63,12,7};
        int target = 23;
        System.out.println(search(arr,target,0));
    }
    public static int search(int[]arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return search(arr,target,index+1);
        }
    }
}