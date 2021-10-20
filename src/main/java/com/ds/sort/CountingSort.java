package com.ds.sort;

import java.util.Arrays;

public class CountingSort {
    // Stable, Time: O(n+k), Auxiliary Space: O(n+k) 
    public int[] sort(int[] arr, int max) {
        int[] counts = new int[max];
        for(int i : arr) {
            counts[i]++;
        }
        //System.out.println(Arrays.toString(counts));
        for(int i = 1; i < counts.length; i++) {
            counts[i] += counts[i-1];
        }
        //System.out.println(Arrays.toString(counts));
        /*
         * for(int i = counts.length-1; i > 0; i-- ) { counts[i] = counts[i-1]; }
         */
        System.out.println(Arrays.toString(counts));
        int[] sorted = new int[arr.length];
        // {1,4,1,2,7,5,2};
        // [0, 2, 4, 4, 5, 6, 6, 7, 7]
        // [0, 0, 2, 4, 4, 5, 6, 6, 7]
        for(int elem : arr) {
            int index = --counts[elem];
            sorted[index] = elem;
            System.out.println(elem + " , " + index + " , ");
            //counts[elem]--;
        }
        //System.out.println(Arrays.toString(sorted));
        return sorted;
    }
}
