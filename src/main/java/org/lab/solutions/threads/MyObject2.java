package org.lab.solutions.threads;

public class MyObject2 {

    public static synchronized void foo(String name){

        System.out.println("Thread " + name + " .foo() : starting ");
        try {
            Thread.sleep(2000);
            System.out.println("Thread " + name + " .foo() : ending ");

        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " .foo() : interrupted ");
        }
    }

    public static synchronized void bar(String name){

        System.out.println("Thread " + name + " .bar() : starting ");
        try {
            Thread.sleep(2000);
            System.out.println("Thread " + name + " .bar() : ending ");

        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " .bar() : interrupted ");
        }
    }


}
