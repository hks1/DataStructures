package com.ds.sort;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        SelectionSort ssort = new SelectionSort();
        int[] arr = new int[] {5,7,4,9,1,0,34,2,};
        ssort.sort(arr);
        System.out.println(Arrays.toString(arr));
        CountingSort csort = new CountingSort();
        int[] arr1 = {1,4,1,2,7,5,2};
        int[] sorted = csort.sort(arr1, 9);
        System.out.println(Arrays.toString(sorted));
        
    }
}
