package com.ds.sort;

public class BubbleSort {
    // stable (also depends how it is implemented)
    public void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for(int j = length-1; j > i; j--) {
                if(array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
