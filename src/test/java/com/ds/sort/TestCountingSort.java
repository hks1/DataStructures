package com.ds.sort;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCountingSort {
    
    CountingSort csort = new CountingSort();
    
    @BeforeAll
    public static void initialize() {
        
    }
    
    @Test
    public void testCountingSort() {
        int[] arr = new int[] {5,6,3,8,2,1,9,3};
        System.out.println(Arrays.toString(arr));
        int[] sorted = new int[arr.length];
        sorted = csort.sort(arr);
        System.out.println(Arrays.toString(sorted));
        System.out.println(Arrays.toString(arr));
    }
    
    @Test
    public void testSimpleCountingSort() {
        int[] arr = new int[] {5,6,3,8,2,1,9,3};
        System.out.println(Arrays.toString(arr));
        int[] sorted = new int[arr.length];
        csort.simpleCountingSort(arr);
        //sorted = csort.sort(arr);
        //System.out.println(Arrays.toString(sorted));
        System.out.println(Arrays.toString(arr));
    }
    
    @Test
    public void testCountingSortWithExp() {
        int[] arr = new int[] {5,6,3,8,2,1,9,31,43,345,9,486};
        System.out.println(Arrays.toString(arr));
        int[] sorted = new int[arr.length];
        //sorted = csort.sort(arr);
        csort.sort(arr, arr.length, 1);
        System.out.println(Arrays.toString(sorted));
        System.out.println(Arrays.toString(arr));
    }

}
