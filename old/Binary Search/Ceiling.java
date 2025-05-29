public class Ceiling{
    public static void main(String[] args) {
        int[]arr = new int[]{2,3,5,9,14,16,18};
        System.out.println(floor(arr,15));
    }
    // ceiling is the smallest number which is greater than or equal to the target number
    public static int ceil(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return arr[mid];
            else if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[start];
    }
    // floor of a number
    public static int floor(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return arr[mid];
            else if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[end];
    }
}