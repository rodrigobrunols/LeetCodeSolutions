package org.lab.solutions.linkedlist;

import java.util.LinkedList;

public class SumLists {


    public MyLinkedList solution(MyLinkedList numero1  , MyLinkedList numero2) {
        Node ponteiro1 = numero1.head;
        Node ponteiro2 = numero2.head;
        MyLinkedList resultado = new MyLinkedList();

        int soma = 0;
        int resto = 0;

        while (ponteiro1 != null || ponteiro2!=null){
            if(ponteiro1!= null){
                soma += ponteiro1.data;
                ponteiro1 = ponteiro1.next;
            }
            if(ponteiro2!= null){
                soma += ponteiro2.data;
                ponteiro2 = ponteiro2.next;
            }

            resultado.insert(soma %10 + resto);

            soma = soma/10;
        }

        return resultado;

    }

    public static void main(String[] args) {

        var primeiro = new MyLinkedList();
        primeiro.insert(0);
        primeiro.insert(1);

        primeiro.dump();

        var segundo = new MyLinkedList();
        segundo.insert(0);
        segundo.insert(0);
        segundo.insert(0);
        segundo.insert(1);
        segundo.dump();

        new SumLists().solution(primeiro,segundo).dump();

    }
}
