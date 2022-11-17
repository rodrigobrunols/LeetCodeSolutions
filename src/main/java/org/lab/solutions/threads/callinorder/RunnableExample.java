package org.lab.solutions.threads.callinorder;

public class RunnableExample extends Thread{

    CallInOrderWithSemaphoreExample callInOrderWithSemaphoreExample;
    String name;

    public RunnableExample(CallInOrderWithSemaphoreExample callInOrderWithSemaphoreExample, String name) {
        this.callInOrderWithSemaphoreExample = callInOrderWithSemaphoreExample;
        this.name = name;
    }


    @Override
    public void run() {
        try {
            callInOrderWithSemaphoreExample.first(name);
            callInOrderWithSemaphoreExample.second(name);
            callInOrderWithSemaphoreExample.third(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        var runnableExample = new RunnableExample(new CallInOrderWithSemaphoreExample(), "runnable1");
        var runnableExample2 = new RunnableExample(new CallInOrderWithSemaphoreExample(),"runnable2");

        runnableExample.start();
        runnableExample2.start();
    }
}
