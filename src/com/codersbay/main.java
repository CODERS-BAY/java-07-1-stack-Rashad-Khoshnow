package com.codersbay;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        IntStack myStack = new IntStack();
        int size = myStack.size();
        System.out.println(size);
        myStack.push(140);
        myStack.push(13);
        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(Arrays.toString(myStack.pop(3)));

    }
}
