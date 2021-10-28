package com.ds.sort;

import java.util.Arrays;

public class QuickSort {
    static int count = 0;
    // best and avg case: O(nlogn), worst case: O(n*2)
    public void sort(int[] arr) {
        helper(arr, 0, arr.length-1);
    }
    
    public void helper(int[] arr, int start, int end) {
        System.out.println("helper: " + " count = " + count++ + " , " + Arrays.toString(arr) + " , start: " + start + " , end: " + end + " , pivot -> ");
        if(start >= end) {
            return;
        }
        int pivot = lomuto(arr, start, end, true);
        int smaller = pivot;
        //System.out.println(pivot);
        //int pivot = lomuto(arr, start, end);
        /*
         * int smaller = start; for (int i = start+1; i <= end; i++) {
         * System.out.println("for loop : " + Arrays.toString(arr) + " start " + start +
         * " smaller " + smaller + " i " + i); if(arr[i] < arr[start]) {
         * System.out.println("for loop : inside if:  " + Arrays.toString(arr));
         * //smaller++; swapArrayElem(arr, ++smaller, i);
         * System.out.println("for loop : inside if - after swap " +
         * Arrays.toString(arr)); } System.out.println("for loop : " +
         * Arrays.toString(arr)); } swapArrayElem(arr, start, smaller);
         * System.out.println("helper: " + Arrays.toString(arr) + " , start  " + start +
         * " , smaller " + smaller);
         */
        helper(arr, start, smaller-1);
        helper(arr, smaller+1, end);
    }
    
    public int lomuto(int[] arr, int start, int end) {
        if(arr.length <=1) {
            return -1;
        }
        // assume pivot is start index
        int smaller = start;
        //int bigger = start;
        for (int i = start + 1; i <= end; i++) {
            if(arr[i] < arr[start]) {
                swapArrayElem(arr, ++smaller, i);
                //bigger++;
            } /*
               * else { bigger++; }
               */
        }
        swapArrayElem(arr, smaller, start);
        return smaller;
    }
    
    public int lomuto(int[] arr, int start, int end, int pivot) {
        if(pivot < start || pivot > end) {
            return -1;
        }
        swapArrayElem(arr, start, pivot);
        return lomuto(arr, start, end);
    }
    
    // for RANDOMIZED Quicksort
    public int lomuto(int[] arr, int start, int end, boolean randomizePivot) {
        if(randomizePivot == true) {
            int pivot = (int) ((Math.random() * (end - start)) + start);
            return lomuto(arr, start, end, pivot);
        } else {
            return lomuto(arr, start, end);
        }
        
    }
    
    public void swapArrayElem(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
