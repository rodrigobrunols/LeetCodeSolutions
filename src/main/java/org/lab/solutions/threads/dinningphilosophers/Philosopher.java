package org.lab.solutions.threads.dinningphilosophers;

public class Philosopher extends Thread{

    private int bites = 10;
    private String nome;
    private Chopstick left, right;

    public Philosopher(String name, Chopstick left, Chopstick right) {
        this.nome = name;
        this.left = left;
        this.right = right;
    }

    public void eat(){
        if(pickup()){
            chew();
            putdown();
        }
    }

    private void putdown() {
        right.putDown();
        left.putDown();
    }

    private void chew() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean pickup() {
        if(!left.pickup()){
            System.out.println("Filosofo " + getNome() + " nao pegou o pauzinho esquerdo.");
            return false;
        }
        System.out.println("Filosofo " + getNome() + " levantou o pauzinho esquerdo.");
        if(!right.pickup()){
            System.out.println("Filosofo " + getNome() + " nao pegou o pauzinho direito.");
            return  false;
        }
        System.out.println("Filosofo " + getNome() + " levantou o pauzinho direito.");
        return true;
    }

    @Override
    public void run() {

        for (int i = 0; i < bites ; i++) {
            eat();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
