package com.ds.utils;

public class Utils {
    public static void swap(int[] arr, int i, int j) {
        /*
         * arr -> input array
         * i, j -> indices to be swapped in the array
         * e.g., [3,4,5], 1, 2 -> [3,5,4]
         */
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
