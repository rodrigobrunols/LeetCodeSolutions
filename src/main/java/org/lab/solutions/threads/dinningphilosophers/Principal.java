package org.lab.solutions.threads.dinningphilosophers;

public class Principal {

    public static void main(String[] args) {
        var a = new Chopstick();
        var b = new Chopstick();
        var c = new Chopstick();
        var d = new Chopstick();


        var p1 = new Philosopher("p1" , a,d);
        var p2 = new Philosopher("p2" , b,a);
        var p3 = new Philosopher("p3" , d,c);


        p1.start();
        p2.start();
        p3.start();

    }
}
