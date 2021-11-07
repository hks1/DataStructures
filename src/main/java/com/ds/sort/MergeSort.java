package com.ds.sort;

import java.util.Arrays;
// stable (if implemented as left[i]<=right[j])

public class MergeSort {
    // Time: O(nlogn), space: O(n)
    //static int count = 0;
    
    public void mergesort(int[] arr, int l, int r) {
        //System.out.print(count++);
        if(l >= r) {
            //System.out.println("return: " + l + " , " + r);
            return;
        }
        
        int m = l + (r-l)/2;
        //System.out.println(Arrays.toString(arr) + " , " + l + " , " + m + " , " + r );
        mergesort(arr, l, m);
        mergesort(arr, m+1, r);
        merge(arr, l, m, r);
    }
    
    public void merge(int[] arr, int l, int m, int r) {
        //System.out.println("merge() : " + Arrays.toString(arr) + " , " + l  + " , " + m + " , " + r + " , " + arr.length);
        //int n1 = m - l + 1;
        //int n2 = r - m;
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];
        
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        
        int k = l;
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length) {
            arr[k++] = left[i++];
        }
        while(j < right.length) {
            arr[k++] = right[j++];
        }
        //System.out.println(Arrays.toString(arr));
    }

}
