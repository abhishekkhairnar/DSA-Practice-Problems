public class PeakIndex {
    public static void main(String[] args) {
        int[]arr=new int[]{0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start != end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                // you are in increasing part
                start = mid + 1;
            } else if(arr[mid] > arr[mid + 1]){
                // you are in decreasing part
                end = mid;
            }
        }
        return start;
    }
}
