package org.lab.solutions.stacksequeues;

import java.util.Stack;

public class SortedStack {


    void sort(Stack<Integer> unsortedStack) {
        Stack<Integer> sortedStack = new Stack<>();

        while (!unsortedStack.isEmpty()) {
            Integer pop = unsortedStack.pop();

            while (!sortedStack.isEmpty() && sortedStack.peek() > pop) {
                unsortedStack.push(sortedStack.pop());
            }

            sortedStack.push(pop);
        }

        while (!sortedStack.isEmpty()) {
            unsortedStack.push(unsortedStack.pop());
        }

    }

    public static void main(String[] args) {
    }
}
