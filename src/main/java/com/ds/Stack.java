package com.ds;

public class Stack {
    static final int MAX = 1000;
    int top;
    int s[] = new int[MAX];
    
    Stack() {
        top = -1;
    }
    
    boolean isEmpty() {
        return (top < 0);
    }
     int size() {
         return top+1;
     }
    
    boolean push(int i) {
        if(top >= MAX - 1) {
            System.out.print("Stack Overflow!");
            return false;
        } else {
            s[++top] = i;
            System.out.println(i + " pushed in stack"+ " stack size is: " + size());
            //System.out.println(s[top]);
            return true;
        }
    }
    
    int pop() {
        if(isEmpty()) {
            System.out.print("Empty stack");
            return -1;
        }
        System.out.println("popping :" +s[top]);
        return s[top--];
    }
    
    int peek() {
        if(isEmpty()) {
            System.out.println("Empty stack");
            return -1;
        }
        System.out.println("peeking :" +s[top]+ " stack size is: " + size());
        return s[top];
    }
    
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        System.out.println(s.pop());
        s.push(11);
        s.peek();
        s.push(12);
        s.push(8);
        s.push(13);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        s.peek();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.peek();
        System.out.println(s.pop());
    }

}
