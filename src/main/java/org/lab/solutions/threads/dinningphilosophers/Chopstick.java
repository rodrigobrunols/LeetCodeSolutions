package org.lab.solutions.threads.dinningphilosophers;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {

    private Lock lock;

    public Chopstick() {
        lock = new ReentrantLock();
    }

    public boolean pickup(){
        return lock.tryLock();
    }

    public void putDown(){
        lock.unlock();
    }
}
