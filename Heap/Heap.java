package Heap;

public class Heap {
    int [] arr;
    int size;
    int capacity;
    Heap(int c){
        int[]arr = new int[c];
        capacity = c;
        size = 0;
    }
    int left(int i){
        return arr[2*i + 1];
    }
    int right(int i){
        return arr[2*i + 2];
    }
    int parent(int i){
        return (int) Math.floor((i-1 / 2)); 
    }

    public static void main(String[] args) {
        
    }
    void insert(int x){
        if(size == capacity) return;
        size++; arr[size-1] = x;
        for(int i = size - 1; i != 0 && arr[parent(i)] > arr[i] ; i++){
            swap(arr,i,parent(i));
            i = parent(i);
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    public void minHeapify(int i){
        int lt = left(i);
        int rt = right(i);
        int smallest = i;
        if(lt < size && arr[lt] > arr[i]){
            smallest = lt;
        }
        if(rt < size && arr[rt] > arr[i]){
            smallest = rt;
        }
        if(smallest != i){
            swap(arr,i,smallest);
            minHeapify(smallest);
        }
    }
}
