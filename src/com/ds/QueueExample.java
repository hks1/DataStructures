package com.ds;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String args[]) {
        Queue<String> queue = new LinkedList<>();
        queue.add("baby one");
        System.out.println(queue);
        queue.add("another string");
        System.out.println(queue.size());
        System.out.println(queue);
        queue.add("another string 1");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue.size());
        System.out.println(queue.contains("check this out"));
        queue.add("check this out");
        System.out.println(queue.contains("check this out"));
        System.out.println(queue.size());
        System.out.println(queue);
        System.out.println(queue.remove());
        queue.clear();
        System.out.println(queue.size());
    }
}
