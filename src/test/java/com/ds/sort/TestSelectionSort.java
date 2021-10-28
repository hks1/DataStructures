package com.ds.sort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestSelectionSort {
    @Test
    public void testSelectionSort() {
        SelectionSort ssort = new SelectionSort();
        int[] arr = new int[] {5,7,4,9,1,0,34,2,};
        int[] sorted_array = new int[] {0,1,2,4,5,7,9,34}; 
        ssort.sort(arr);
        //System.out.println(Arrays.toString(arr));
        Assert.assertArrayEquals(sorted_array, arr);
    }
}
