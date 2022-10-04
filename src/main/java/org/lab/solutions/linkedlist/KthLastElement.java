package org.lab.solutions.linkedlist;

public class KthLastElement {


    public int count(Node head) {
        Node n = head;
        int count = 0;

        while (n != null){
            count++;
            n=n.next;
        }
        return count;
    }

    public int solution(Node head, int k) {
        int total = count(head);

        int alvo = count(head) + 1 - k;

        if(alvo <= total){//check k > size

            Node n = head;

            int count = 1;

            while (count<alvo){
                count++;
                n=n.next;
            }
            return n.data;
        }
        return -1;

    }

    public static void main(String[] args) {

        var linkedList = new MyLinkedList();

        new KthLastElement().solution(linkedList.head,2);//antepenultimo

    }
}
