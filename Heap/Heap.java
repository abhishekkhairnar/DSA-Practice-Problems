package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    // Heap is nothing but internally it is a array ordered in either minHeap or maxHeap
    public static class MinHeap{
        int[]arr;
        int heap_size;
        int capacity;
        MinHeap(int cap){
            capacity = cap;
            arr = new int[cap];
        }
        // parent of ith node
        // here node is referred as element of array
        int parent(int i){
            return (i - 1) / 2;
        }
        // method to get left child of the node
        int leftChild(int i){
            return (2 * i) + 1;
        }
        // method to get right child of the node
        int rightChild(int i){
            return (2 * i) + 2;
        }
        // method to insert key into the heap
        void insertKey(int k){
            if(capacity == heap_size) return;
            heap_size++;
            arr[heap_size-1] = k;
            int i = heap_size - 1;
            while(i != 0 && arr[parent(i)] > arr[i]){
                int temp = arr[parent(i)];
                arr[parent(i)] = arr[i];
                arr[i] = temp;
                i = parent(i);
            }
        }
        // update key method updates the at the given index with new_value
        public void updatekey(int key,int new_val){
            arr[key] = new_val;
            int i = heap_size - 1;
            while(i != 0 && arr[parent(i)] > arr[i]){
                int temp = arr[parent(i)];
                arr[parent(i)] = arr[i];
                arr[i] = temp;
                i = parent(i);
            }
        }
        // delete key method deletes the at the given index
        public void deleteKey(int i){
            updatekey(i,Integer.MIN_VALUE);
            // swapping 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // decreasing size
            heap_size--;
            minHeapify(0);
        }
        private void minHeapify(int i) {
            int lc = leftChild(i);
            int rc = rightChild(i);
            int largest = 0;
            if(lc < heap_size && arr[lc] > arr[i]){
                largest = lc;
            }
            if(rc < heap_size && arr[rc] > arr[i]){
                largest = rc;
            }
            if(largest != i)
            {
                int temp = arr[largest];
                arr[largest] = arr[i];
                arr[i] = temp;
            }
        }
        public void buildHeap(){
            for(int i = (heap_size - 2) / 2; i >= 0 ;i--){
                minHeapify(i);
            }
        }
        public void heapSort(){
            buildHeap();
            for(int i = heap_size - 1; i >= 1; i--){
                // swap
                int temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                minHeapify(i);
            }
        }
        public void print(){
            for(int i=0;i<heap_size;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // this creates a minheap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(10, null);
        // this creates a maxheap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        MinHeap h = new MinHeap(11);
        h.insertKey(3);
        h.insertKey(2);
        // h.deleteKey(1);
        h.insertKey(15);
        h.insertKey(5);
        h.insertKey(4);
        h.insertKey(45);
        h.heapSort();
        h.print();
    }

}
