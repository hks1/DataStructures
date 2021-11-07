package com.ds.sort;

import java.util.Arrays;

public class QuickSort {
    // not-stable
    static int count = 0;
    // best and avg case: O(nlogn), worst case: O(n*2)
    public void sort(int[] arr) {
        helper(arr, 0, arr.length-1);
    }
    
    public void helper(int[] arr, int start, int end) {
        //System.out.println("helper: " + " count = " + count++ + " , " + Arrays.toString(arr) + " , start: " + start + " , end: " + end + " , pivot -> ");
        if(start >= end) {
            return;
        }
        int pivot = lomuto(arr, start, end, true);
        //int pivot = hoares(arr, start, end);
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
    
    // Lomuto's Partitioning
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
    
    // 3-way partitioning  - handle situations where there are lots of duplicates in the array
    public int[] partition3way(int[] arr, int start, int end, int pivot) {
        if(pivot < start || pivot > end) {
            return null;
        }
        //int pivot_elem = arr[pivot];
        swapArrayElem(arr, start, pivot);
        int pivot_element = arr[start];
        int first = start-1, second = start; // first for less than, second for equal elements
        for(int i = start + 1; i <= end; i++) {
            System.out.println("i: " + i + " array: " + Arrays.toString(arr) + " arr[i]: " + arr[i] + " first: " + first + " second: " + second);
            if(arr[i] == pivot_element) {
                System.out.println("first if");
                swapArrayElem(arr, ++second, i);
            }
            if(arr[i] < pivot_element) {
                System.out.println("second if");
                swapArrayElem(arr, ++second, i);
                swapArrayElem(arr, ++first, second);
            }
            System.out.println("i: " + i + " array: " + Arrays.toString(arr));
            System.out.println("i: " + i + " array: " + Arrays.toString(arr) + " arr[i]: " + arr[i] + " first: " + first + " second: " + second);
        }
        return new int[]{first+1, second};
    }
    
    // Hoare's Partitioning
    public int hoares(int[] arr, int start, int end) {
        int left = start+1;
        int right = end;
        while(left <= right) {
            if(arr[left] < arr[start]) {
                left++;
            } else if (arr[right] > arr[start]) {
                right--;
            } else {
                swapArrayElem(arr, left, right);
            }
        }
        swapArrayElem(arr, start, right);
        return right;
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
