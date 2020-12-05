package com.codersbay;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntStackTest {

    @Test
    public void testEmptyStackHasSizeZero() {
        IntStack myStack = new IntStack();
        assertEquals(myStack.size(), 0);
    }

    @Test
    public void stackHasSizeThree() {
        IntStack myStack = new IntStack();
        myStack.push(12);
        myStack.push(124);
        myStack.push(122);
        assertEquals(myStack.size(), 3);
    }

    @Test
    public void peekReturnsLastStack() {
        IntStack myStack = new IntStack();
        myStack.push(12);
        myStack.push(124);
        myStack.push(122);
        assertEquals(myStack.peek(), 122);
        assertEquals(myStack.peek(), 122);
    }

    @Test
    public void peekOnEmptyStack() {
        IntStack myStack = new IntStack();
        assertThrows(StackTooSmallException.class, () -> {
            myStack.peek();
        });
    }

    @Test
    public void pop() {
        IntStack myStack = new IntStack();
        myStack.push(12);
        myStack.push(124);
        myStack.push(122);
        assertEquals(myStack.pop(), 122);
        assertEquals(myStack.pop(), 124);
        assertEquals(myStack.pop(), 12);
        assertThrows(StackTooSmallException.class, () -> {
            myStack.pop();
        });
    }
}
