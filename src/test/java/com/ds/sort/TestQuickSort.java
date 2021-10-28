package com.ds.sort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestQuickSort {

    QuickSort qsort = new QuickSort();

    @Before
    public void setup() {

    }

    
    @Test
    public void testQuickSort() {
        System.out.println("testQuickSort : start");
        int[] arr = new int[] { 5, 7, 4, 9, 1, 0, 34, 2, };
        int[] sorted = new int[] { 0, 1, 2, 4, 5, 7, 9, 34 };
        //int[] arr = new int[] { 8, 5, 7 };
        //int[] sorted = new int[] {  5, 7, 8 };
        System.out.println(Arrays.toString(arr));
        
        // QuickSort qsort = new QuickSort();
        qsort.sort(arr);
        Assert.assertArrayEquals(sorted, arr);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("testQuickSort : end");
    }
    
    @Test
    public void testQuickSort_1() {
        System.out.println("testQuickSort : start");
        //int[] arr = new int[] { 5, 7, 4, 9, 1, 0, 34, 2, };
        //int[] sorted = new int[] { 0, 1, 2, 4, 5, 7, 9, 34 };
        int[] arr = new int[] { 8, 5, 7 };
        int[] sorted = new int[] {  5, 7, 8 };
        System.out.println(Arrays.toString(arr));
        
        // QuickSort qsort = new QuickSort();
        qsort.sort(arr);
        Assert.assertArrayEquals(sorted, arr);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("testQuickSort : end");
    }
    
    @Test
    public void testQuickSortEmptyArray() {
        /*
         * int[] arr = new int[] { 5, 7, 4, 9, 1, 0, 34, 2, }; int[] sorted = new int[]
         * { 0, 1, 2, 4, 5, 7, 9, 34 };
         */
        int[] arr = new int[] {};
        int[] sorted = new int[] {};
        System.out.println(Arrays.toString(arr));
        
        // QuickSort qsort = new QuickSort();
        qsort.sort(arr);
        Assert.assertArrayEquals(sorted, arr);
    }
    
    @Test
    public void testQuickSortSingleElemArray() {
        int[] arr = new int[] {7};
        int[] sorted = new int[] {7};
        System.out.println(Arrays.toString(arr));
        
        // QuickSort qsort = new QuickSort();
        qsort.sort(arr);
        Assert.assertArrayEquals(sorted, arr);
    }

    @Test
    public void testSwap() {
        int[] arr = new int[] { 5, 7, 4, 9, 1, 0, 34, 2, };
        int[] new_arr = new int[] { 5, 0, 4, 9, 1, 7, 34, 2, };
        qsort.swapArrayElem(arr, 1, 5);
        System.out.println(Arrays.toString(arr));
        Assert.assertEquals(0, arr[1]);
        Assert.assertEquals(7, arr[5]);
        Assert.assertArrayEquals(new_arr, arr);
    }

    @Test
    public void testLomuto() {
        // int[] arr = new int[] {5,7,4,9,1,0,6,3,2,};
        int[] arr = new int[] { 15, 17, 14, 19, 11, 10, 16, 13, 12, };
        // System.out.println(Arrays.toString(arr));
        // qsort.lomuto(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr));
        Assert.assertEquals(5, qsort.lomuto(arr, 0, arr.length - 1));
    }

    @Test
    public void testLomuto1() {
        // int[] arr = new int[] {5,7,4,9,1,0,6,3,2,};
        int[] arr = new int[] { 15, 17, 14, 19, 11, 10, 16, 13, 12, };
        // System.out.println(Arrays.toString(arr));
        // qsort.lomuto(arr, 2, arr.length-1);
        // System.out.println(Arrays.toString(arr));
        Assert.assertEquals(6, qsort.lomuto(arr, 2, arr.length - 1));
    }

    @Test
    public void testLomutoCustomPivot() {
        int[] arr = new int[] { 5, 7, 4, 9, 1, 0, 6, 3, 2, };
        // System.out.println(Arrays.toString(arr));
        // qsort.lomuto(arr, 0, arr.length-1, 2);
        // System.out.println(Arrays.toString(arr));
        Assert.assertEquals(4, qsort.lomuto(arr, 0, arr.length - 1, 2));
    }

    @Test
    public void testLomutoRandomPivot() {
        int[] arr = new int[] { 25, 27, 24, 29, 21, 20, 26, 23, 22, };
        System.out.println(Arrays.toString(arr));
        // int i = qsort.lomuto(arr, 0, arr.length-1, 2);
        int i = qsort.lomuto(arr, 0, arr.length - 1, true);
        System.out.println(Arrays.toString(arr) + " , " + i);
        // Assert.assertEquals(4, qsort.lomuto(arr, 0, arr.length-1, 2));
    }
    
    @Test
    public void testLomutoRandomPivot_1() {
        System.out.println("testLomutoRandomPivot_1(): start");
        int[] arr = new int[] { 25, 27, 24, 29, 21, 20, 26, 23, 22, };
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
        System.out.println(Arrays.toString(arr));
        // int i = qsort.lomuto(arr, 0, arr.length-1, 2);
        int i = qsort.lomuto(arr, 3, arr.length - 1, true);
        System.out.println(Arrays.toString(arr) + " , " + i);
        // Assert.assertEquals(4, qsort.lomuto(arr, 0, arr.length-1, 2));
        System.out.println("testLomutoRandomPivot_1(): end");
    }

}
