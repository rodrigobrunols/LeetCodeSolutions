package org.lab.solutions.stacksequeues;

import java.util.EmptyStackException;

public class MyQueue<T> {

    private static class QueueNode<T>{

        private T data;
        private QueueNode<T> next;
        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T item){
        QueueNode<T> newNode = new QueueNode<>(item);

        if (last != null){
            last.next = newNode;
        }

        last = newNode;

        if(first == null){
            first = last;
        }
    }

    public T remove () throws Exception {

        if(first == null){
            throw new Exception("Empty Queue");
        }

        T data = first.data;
        first = first.next;
        if(first == null){
            last =null;
        }

        return data;
    }

    public T peek(){
        if(first == null)throw  new EmptyStackException();
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}
