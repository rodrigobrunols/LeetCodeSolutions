package org.lab.solutions.linkedlist;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDups {


    public HashSet solution(MyLinkedList linkedList) {

        var aux = new HashSet();

        var n = linkedList.head;

        while (n!=null){
            aux.add(n.data);
            n=n.next;
        }
        return aux;


    }

    public static void main(String[] args) {

        var linkedList = new MyLinkedList();

        new RemoveDups().solution(linkedList);

    }
}
