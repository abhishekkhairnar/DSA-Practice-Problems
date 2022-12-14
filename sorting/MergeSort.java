import java.util.Arrays;
public class MergeSort{
    public static void main(String[]args){
        int[]arr={3,9,1,5,8,4,7};
        mergeSort(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[]arr,int l,int r){
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    public static void merge2(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void merge(int[]arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[]left = new int [n1];
        int[]right = new int[n2];
        
        for(int i=0;i<n1;++i){
            left[i] = arr[l+i];
        }
        for(int i=0;i<n2;++i){
            right[i] = arr[mid+1+i]; 
        }

        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i>n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j>n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}