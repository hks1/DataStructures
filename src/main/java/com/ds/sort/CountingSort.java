package com.ds.sort;

import java.util.Arrays;

public class CountingSort {
    // Stable, Time: O(n+k), Auxiliary Space: O(n+k) 
    
    public int[] sort(int[] arr) {
        int max = arr.length + 10;
        int[] counts = new int[max];
        for(int i : arr) {
            counts[i]++;
        }
        for(int i = 1; i < counts.length; i++) {
            counts[i] += counts[i-1];
        }
        /*
         * for(int i = counts.length-1; i > 0; i-- ) { counts[i] = counts[i-1]; }
         */
        int[] sorted = new int[arr.length];
        for(int elem : arr) {
            int index = --counts[elem];
            sorted[index] = elem;
            //counts[elem]--;
        }
        return sorted;
    }
    
    public void sort(int[] arr, int n , int exp) {
        /*
         * counting sort module for Radix sort
         * n -> size of array
         * exp -> 1, 10, 100 starting from least significant digit
         */
        int sorted[] = new int[n];
        int count[] = new int[10]; //0,1,2,...,9
        
        // Store count of occurences in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        //System.out.println(Arrays.toString(count));
        
        // Change count[i] so that count[i] now contains
        // actual position of this digit in sorted[]
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        //System.out.println(Arrays.toString(count));
        
        // Build the sorted array
        for (int i = n - 1; i >= 0; i--) {
            sorted[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--; 
            //System.out.println(Arrays.toString(count));
        }
        
        // copy sorted to arr
        for (int i = 0; i < sorted.length; i++) {
            arr[i] = sorted[i];
        }
        
        //return sorted;
        
    }
    
    // experimental
    public void simpleCountingSort(int[] arr) {
        int max = 10;
        int[] counts = new int[max];
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }
        int j =0;
        for (int i = 0; i < counts.length; i++) {
            while(counts[i] > 0) {
                arr[j++] = i;
                counts[i]--;
            }
        }
    }
}
