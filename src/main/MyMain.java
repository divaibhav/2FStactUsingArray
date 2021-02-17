package main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        int capacity = 5;
        MyStack stack  = new MyStack(capacity);
        System.out.println("element removed" + stack.pop());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("no of elements in stack = "
                + stack.size());
        System.out.println("element removed" + stack.pop());
        System.out.println("element at top = " + stack.peek());
        stack.traverse();
        System.out.println("searching 20 in stack, found = "
                + stack.search(20));


    }
}
