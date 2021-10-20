package com.ds.sort;

import java.util.Arrays;

public class CountingSort {
    // Stable, Time: O(n+k), Auxiliary Space: O(n+k) 
    
    public int[] sort(int[] arr) {
        int max = arr.length;
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
}
