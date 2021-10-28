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
}
