class MergeTwoArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=m;
        for(int ele: nums2){
            nums1[idx]=ele;
            idx++;
        }
        
        // sort the array
        for(int i=0;i<m+n;i++){
            for(int j=1;j<m+n-i;j++){
                if(nums1[j-1] > nums1[j]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j-1];
                    nums1[j-1] = temp;
                }
            }
        }
        
    }
}