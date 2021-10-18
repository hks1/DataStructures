package com.ds.sort;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        SelectionSort ssort = new SelectionSort();
        int[] arr = new int[] {5,7,4,9,1,0,34,2,};
        ssort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
