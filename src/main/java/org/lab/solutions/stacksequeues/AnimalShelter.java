package org.lab.solutions.stacksequeues;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {


    private Queue<Animal> dogsQueue;
    private Queue<Animal> catsQueue;

    public AnimalShelter(Queue<Animal> dogsQueue, Queue<Animal> catsQueue) {
        this.dogsQueue = dogsQueue;
        this.catsQueue = catsQueue;
    }

    public AnimalShelter(Queue<Dog> dogsQueue) {
        this.dogsQueue = new LinkedList<>() ;
        this.catsQueue = new LinkedList<Animal>();
    }


    public boolean enqueue(Animal pet){
        if(Animal.Kind.CAT.equals(pet.getKind())){
            return catsQueue.add(pet);
        }else if (Animal.Kind.DOG.equals(pet.getKind())){
            return dogsQueue.add(pet);
        }
        return false;
    }

    public Animal dequeueAny(){
        return dogsQueue.peek().getArriveTime().isBefore(catsQueue.peek().getArriveTime()) ?
                dogsQueue.poll()
                :catsQueue.poll();
    }

    public Dog dequeueDog(){
        return (Dog) dogsQueue.poll();
    }

    public Cat dequeueCat(){
        return (Cat) catsQueue.poll();
    }

}
