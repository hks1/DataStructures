package com.ds.sort;

import com.ds.utils.Utils;
public class HeapSort {
    
    public void buildHeap(int[] arr, int n) {
        for(int i = n/2; i >= 0; i--) {
            //heapify(arr, n-i, i);
            heapify(arr, n, i);
        }
    }
    
    void heapify(int[] arr, int n, int i) {
        /*
         * if((2*i + 1) > (n-1)) { return; }
         */
        /*
         * heapify n-size heap rooted at index i
         */
        int largest = i;
        int l = 2*i + 1;
        int r = l + 1; //2*i + 2;
        if(l < n && arr[largest] < arr[l]) {
            largest = l;
        }
        if(r < n && arr[largest] < arr[r]) {
            largest = r;
        }
        if(largest != i) {
            Utils.swap(arr, i, largest);
        } else {
            return;
        }
        
        // Heapify the root
        heapify(arr, n, largest);
    }
    
    public int extractMax(int[] arr, int n) {
        Utils.swap(arr, 0, n-1);
        heapify(arr, n-1, 0);
        return arr[n-1];
    }
    
    public void heapSort(int[] arr) {
        int n = arr.length;
        buildHeap(arr, n);
        for(int i = n-1; i >= 0; i--) {
            Utils.swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
}
