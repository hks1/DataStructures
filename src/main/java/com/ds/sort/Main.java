package com.ds.sort;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        SelectionSort ssort = new SelectionSort();
        int[] arr = new int[] {5,7,4,9,1,0,34,2,};
        ssort.sort(arr);
        System.out.println(Arrays.toString(arr));
        CountingSort csort = new CountingSort();
        int[] arr1 = {1,4,1,2,6,5,2,6,6};
        int[] sorted = csort.sort(arr1);
        System.out.println(" original array : " + Arrays.toString(arr1));
        System.out.println(" sorted (counting sort) array : " + Arrays.toString(sorted));
        
    }
}
