package com.ds.sort;

import java.util.Arrays;

public class SelectionSort {
    
    // In-place, Time: O(n*n), Aux space: O(1)
    
    public void sort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int index = i;
            for(int j = i+1; j < n; j++) {
                if(nums[j] < nums[index]) {
                    index = j;
                }
            }
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }

}


