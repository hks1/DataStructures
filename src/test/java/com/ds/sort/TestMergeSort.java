package com.ds.sort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestMergeSort {
    @Test
    public void testMergeSort() {
        MergeSort msort = new MergeSort();
        int[] arr = new int[] {5,7,4,9,1,0,34,2,};
        int[] sorted_array = new int[] {0,1,2,4,5,7,9,34}; 
        /*
         * int[] arr = new int[] {5,7,4, 8}; int[] sorted_array = new int[] {4,5,7, 8};
         */
        msort.mergesort(arr, 0, arr.length - 1);
        Assert.assertArrayEquals(sorted_array, arr);
        //System.out.println(Arrays.toString(arr));
    }
    
    @Test
    public void testMergeSortMillionNumbers() {
        MergeSort msort = new MergeSort();
        int size = 1000000;
        long start_array_creation = System.nanoTime();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }
        long end_array_creation = System.nanoTime();
        long nanoseconds = end_array_creation - start_array_creation;
        long seconds = nanoseconds/1000000000;
        System.out.println("Time taken in creating array of size " + size + " is : " + nanoseconds + " ns" + " = " + seconds + " seconds");
        System.out.println(arr[0] + " ... " + arr[arr.length-1]);
        msort.mergesort(arr, 0, arr.length-1);
        System.out.println(arr[0] + " ... " + arr[arr.length-1]);
    }
}
