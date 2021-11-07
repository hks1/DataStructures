package com.ds.sort;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class TestRadixSort {
    RadixSort rsort = new RadixSort();
    
    @Test
    public void testRadixSort() {
        System.out.println("testRadixSort(): start");
        int[] arr = new int[] {5,6,3,8,2,1,9,31,43,345,9,486};
        System.out.println(Arrays.toString(arr));
        int[] sorted = new int[arr.length];
        //sorted = csort.sort(arr);
        //sorted = csort.sort(arr, arr.length, 1);
        rsort.sort(arr, arr.length);
        System.out.println(Arrays.toString(sorted));
        System.out.println(Arrays.toString(arr));
        System.out.println("testRadixSort(): end");
    }
}
