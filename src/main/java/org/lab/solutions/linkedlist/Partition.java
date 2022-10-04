package org.lab.solutions.linkedlist;

import java.util.LinkedList;

public class Partition {


    public MyLinkedList solution(MyLinkedList listToPartition, int data) {

        MyLinkedList newList = new MyLinkedList();
        Node current = listToPartition.head;

        while (current != null) {
            if (current.data < data) {
                newList.insertBegin(current.data);
            }else {
                newList.insert(current.data);
            }
            current = current.next;
        }

        return newList;

    }

    public static void main(String[] args) {

        var linkedList = new MyLinkedList();
        linkedList.insert(3);
        linkedList.insert(5);
        linkedList.insert(8);
        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(2);
        linkedList.insert(1);

        linkedList.dump();

        new Partition().solution(linkedList, 7).dump();


    }
}
