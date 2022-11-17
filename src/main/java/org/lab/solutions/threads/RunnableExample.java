package org.lab.solutions.threads;

import java.awt.*;

public class RunnableExample implements  Runnable{
    @Override
    public void run() {
        var count = 0;
        while (count<5){
            try {
                Thread.sleep(500);
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("RunnableThread terminating.");
        }
    }

    public static void main(String[] args) {
       var instance = new RunnableExample();
       var thread = new Thread(instance);
       thread.start();

    }
}
