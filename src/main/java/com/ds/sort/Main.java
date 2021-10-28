package com.ds.sort;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = new int[] {5,7,4,9,1,0,34,2,};
        
        // Selection Sort
        //SelectionSort ssort = new SelectionSort();
        System.out.println(" original array : " + Arrays.toString(arr));
        //ssort.sort(arr);
        //System.out.println("sorted (Selection Sort) array: " + Arrays.toString(arr));
        
        // Bubble Sort
        BubbleSort bsort = new BubbleSort();
        //int[] arr = new int[] {5,7,4,9,1,0,34,2,};
        System.out.println(" original array : " + Arrays.toString(arr));
        bsort.sort(arr);
        System.out.println("sorted (bubble sort) array: " + Arrays.toString(arr));
        
        // Counting Sort
        CountingSort csort = new CountingSort();
        int[] arr1 = {1,4,1,2,6,5,2,6,6};
        int[] sorted = csort.sort(arr1);
        System.out.println(" original array : " + Arrays.toString(arr1));
        System.out.println(" sorted (counting sort) array : " + Arrays.toString(sorted));
        
     // Insertion Sort
        InsertionSort isort = new InsertionSort();
        int[] arr2 = {1,4,1,2,6,5,2,6,6};
        //int[] arr2 = {};
        System.out.println(" original array : " + Arrays.toString(arr2));
        isort.sort(arr2);
        //int[] isorted = isort.sort(arr2);
        System.out.println(" sorted (insertion sort) array : " + Arrays.toString(arr2));
        
    }
}
