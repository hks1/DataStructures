package com.ds.sort;

public class InsertionSort {
    // time: worst & avg case O(n*n), best case O(n)
    
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int index = i-1;
            while(index >=0 && temp < arr[index]) {
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = temp;
        }
    }

}
