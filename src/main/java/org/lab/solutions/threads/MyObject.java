package org.lab.solutions.threads;

public class MyObject {
    public MyObject() {
    }

    public synchronized void foo(String name) {

        System.out.println("Thread " + name + " .foo() : starting ");
        try {
            Thread.sleep(2000);
            System.out.println("Thread " + name + " .foo() : ending ");

        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " .foo() : interrupted ");
        }

    }
}
