public class FindInMountainArray {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = peakIndexInMountainArray(mountainArr);
        
        int inFirstHalf = orderAgnosticBS(mountainArr, target, 0, peakIndex);
        if(inFirstHalf != -1)
            return inFirstHalf;

    
        return orderAgnosticBS(mountainArr, target, peakIndex + 1,mountainArr.length()-1);
    }
    public static int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start != end){
            int mid = start + (end - start) / 2;
            int midElement = mountainArr.get(mid);
            int midPlusOne = mountainArr.get(mid+1);
            
            if(midElement < midPlusOne){
                // you are in increasing part
                start = mid + 1;
            } else if(midElement > midPlusOne){
                // you are in decreasing part
                end = mid;
            }
        }
        return start;
    }
    public static int orderAgnosticBS(MountainArray mountainArr , int target,int start,int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midElement = mountainArr.get(mid);
            if(mountainArr.get(mid) == target)
                return mid;

            if(isAsc){
                if(target < midElement){
                    end = mid - 1;
                }
                else if(target > midElement){
                    start = mid + 1;
                }
            }else{
                if(target < midElement){
                    start = mid + 1;
                }
                else if(target > midElement){
                    end = mid - 1;
                }
            }       
        }
        return -1;
    }
}