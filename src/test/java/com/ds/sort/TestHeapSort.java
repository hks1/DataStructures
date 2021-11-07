package com.ds.sort;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
public class TestHeapSort {
    HeapSort hsort = new HeapSort();
    @Test
    public void testHeapify() {
        System.out.println("testHeapify():: start");
        HeapSort hsort = new HeapSort();
        int[] arr = {4,1,3,9,7};
        //hsort.heapify(arr, 1, 4);
        hsort.heapify(arr, 5, 1);
        hsort.heapify(arr, 5, 0);
        //hsort.heapify(arr, 5, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println("testHeapify():: end");
    }
    
    @Test
    public void testBuildHeap() {
        System.out.println("testBuildHeap():: start");
        HeapSort hsort = new HeapSort();
        int[] arr = {4,1,3,9,7};
        //hsort.heapify(arr, 1, 4);
        hsort.buildHeap(arr, 5);
        //hsort.heapify(arr, 5, 0);
        //hsort.heapify(arr, 5, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println("testBuildHeap():: end");
    }
    
    @Test
    public void testHeapSort() {
        System.out.println("testHeapSort():: start");
        int[] arr = new int[] {-4,10,3,5,1};
        //int[] arr = new int[] {};
        hsort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("testHeapSort():: end");
    }
    
    @Test
    public void testExtractMax() {
        System.out.println("testExtractMax():: start");
        int[] arr = new int[] {-4,10,3,5,1};
        //int[] arr = new int[] {};
        hsort.buildHeap(arr, 5);
        //hsort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
        int max = hsort.extractMax(arr, 5);
        System.out.println(max + " , " + Arrays.toString(arr));
        System.out.println("testExtractMax():: end");
    }

}
