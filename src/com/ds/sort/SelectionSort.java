package com.ds.sort;

import java.util.Arrays;

public class SelectionSort {
    
    // O(n*n)
    
    public void sort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            //int min = nums[i];
            int index = i;
            for(int j = i+1; j < n; j++) {
                if(nums[j] < nums[index]) {
                    //min = nums[j];
                    index = j;
                }
            }
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }

}

class Main{
    public static void main(String[] args) {
        SelectionSort ssort = new SelectionSort();
        int[] arr = new int[] {5,7,4,9,1,0,34,2,};
        ssort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
