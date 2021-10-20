package com.ds;

public class LinkedListExample {
    Node head;
    
    public LinkedListExample() {
        // TODO Auto-generated constructor stub
        head = null;
    }
    
    static class Node {
        int val;
        Node next;
        
        Node(int i){
            val = i;
            next = null;
        }
    }
    
    static LinkedListExample insert(LinkedListExample list, Node node) {
        if(list.head == null) {
            list.head = node;
        } else {
            System.out.println("inserting : " + node.val);
            Node x = list.head;
            while(x.next != null)
                x = x.next;
            x.next = node;
        }
        return list;
    }
    
    static boolean remove(LinkedListExample list, int i) {
        if(list.head != null && list.head.val == i) {
            list.head.next = list.head.next.next;
            return true;
        }
        Node x = list.head;
        while(x.next != null) {
            if(x.next.val == i) {
                x.next = x.next.next;
                return true;
            }
                
        }
        return false;
    }
    
    static void print(LinkedListExample list) {
        Node x = list.head;
        System.out.println(x.val);
        while(x.next != null) {
            System.out.print(x.val + " ");
            x = x.next;
        }
    }
    
    public static void main(String args[]) {
        LinkedListExample list = new LinkedListExample();
        
          list = insert(list, new Node(4)); 
          list = insert(list, new Node(5));
          list = insert(list, new Node(6)); 
          list = insert(list, new Node(7));
          list = insert(list, new Node(8)); 
          list = insert(list, new Node(9));
          print(list);
          remove(list, 4);
          print(list);
          remove(list, 9);
          print(list);
          remove(list, 5);
          print(list);
          remove(list, 14);
          print(list);
          remove(list, 7);
          print(list);
          remove(list, 8);
          print(list);
          remove(list, 6);
          print(list);
          remove(list, 1);
          print(list);
         
        
    }

}
