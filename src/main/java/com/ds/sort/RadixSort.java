package com.ds.sort;

import java.util.Iterator;

public class RadixSort {
    CountingSort csort = new CountingSort();
    
    public void sort(int[] arr, int n) {
        // Find the maximum number to know number of digits
        int max = getmax(arr);
        
        // do counting sort for every digit.
        for(int exp = 1; max / exp > 0; exp *= 10) {
            csort.sort(arr, n, exp);
        }
    }
    
    public int getmax(int[] arr) {
        int max = arr[0];
        for(int i : arr) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }
}
