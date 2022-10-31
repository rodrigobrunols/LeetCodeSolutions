package org.lab.solutions.threads.callinorder;

import java.util.concurrent.Semaphore;

public class CallInOrderWithSemaphoreExample {

    private Semaphore s1,s2;
    int time = 500;

    public CallInOrderWithSemaphoreExample() {
        this.s1 = new Semaphore(1);

        this.s2 = new Semaphore(2);

        try {
            s1.acquire();
            s2.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void first(String name) throws InterruptedException {
        System.out.println("first called by "+ name);
        Thread.sleep(time);
        s1.release();
    }
    public void second(String name) throws InterruptedException {
        s1.acquire();
        s1.release();
        s2.acquire();
        System.out.println("second called by "+ name);

        Thread.sleep(time);
        s2.release();
    }
    public void third(String name) throws InterruptedException {
        s2.acquire();
        s2.release();
        System.out.println("third called by "+ name);
    }

}
