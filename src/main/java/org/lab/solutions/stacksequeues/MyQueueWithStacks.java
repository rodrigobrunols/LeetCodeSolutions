package org.lab.solutions.stacksequeues;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.EmptyStackException;

public class MyQueueWithStacks<T> {

   MyStack<T> stackNewest, stackOldest;

    public MyStack<T> getStackNewest() {
        return stackNewest;
    }

    public void setStackNewest(MyStack<T> stackNewest) {
        this.stackNewest = stackNewest;
    }

    public MyStack<T> getStackOldest() {
        return stackOldest;
    }

    public void setStackOldest(MyStack<T> stackOldest) {
        this.stackOldest = stackOldest;
    }

    public MyQueueWithStacks(){
       this.stackNewest = new MyStack<>();
       this.stackOldest = new MyStack<>();
   }

   public int size(){
        return stackNewest.size() + stackOldest.size();
   }
    public void add(T data){
        stackNewest.push(data);
    }

    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while (!stackNewest.isEmpty()){
                stackOldest.push(stackOldest.pop());
            }
        }
    }

    public T peek(){
        shiftStacks();
        return  stackOldest.peek();
    }

    public T remove(){
        shiftStacks();
        return stackOldest.pop();
    }

}
