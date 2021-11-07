package com.ds.sort;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println((int) (Math.random() * 100));
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(8);
        System.out.println(arr);
        arr.add(1, 9);
        System.out.println(arr);
    }
}
