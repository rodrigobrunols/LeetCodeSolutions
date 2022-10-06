package org.lab.solutions.stacksequeues;

import java.util.EmptyStackException;
import java.util.concurrent.ThreadPoolExecutor;

public class MyStack<T> {

    private int size = 0;

    public int size() {
        return size;
    }

    protected static class StackNode<T>{

        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    protected StackNode<T> top;

    public T pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public void push(T data){
        StackNode<T> newTop = new StackNode<>(data);
        newTop.next = top;
        top = newTop;
        size++;
    }

    public T peek(){
        if(top == null)throw  new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
