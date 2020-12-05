package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class IntStack {
    private List<Integer> intList = new ArrayList<>();

    public void push(int newElement) {
        intList.add(newElement);
    }

    public int size() {
        int listSize = intList.size();
        return listSize;
    }

    public int pop() {
        if (intList.size() <= 0) {
            throw new StackTooSmallException();
        }

        int remove = intList.remove(intList.size() - 1);
        return remove;
    }

    public int peek() {
        if (intList.size() <= 0) {
            throw new StackTooSmallException();
        }
        int lastNumber = intList.get(intList.size() - 1);
        return lastNumber;
    }

    public int[] pop(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = pop();
        }
        return numbers;
    }
}
