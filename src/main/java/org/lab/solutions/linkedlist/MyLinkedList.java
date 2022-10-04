package org.lab.solutions.linkedlist;

public class MyLinkedList {

    Node head;

    void dump() {
        if(head == null ){
            return;
        }

        Node current = head;

        while (current != null){
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println();

    }

    Node insert(int data){
        return insert(new Node(data));
    }
    Node insert (Node node){
        if (head == null){
            head = node;
            return head;
        }
        Node tail = head;

        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = node;

        return head;
    }

    Node insertBegin (Node node){
        node.next = head;
        head = node;
        return head;
    }

    Node insertBegin (int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }
    Node deleteNode(Node head , int data){
        Node n = head;

        if(head.data == data){ /* pop head*/
            head = head.next;
        }

        while (n.next!= null){
            if(n.next.data== data){
                n.next = n.next.next;
                return head;/*  head do not change*/
            }
            n = n.next;
        }
        return head;
    }
    // head < n < ultimo
    boolean remove(Node n){

        if(n == null || n.next == null){
            return false;
        }

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }


    boolean remove (int data){

        if(head == null ) return false ;

        if(head.data == data) {
            head = head.next;
            return true;
        }

        Node current = head;

        while (current.next != null && current.next.data != data){
            current = current.next;
        }

        current.next = current.next.next; //remove

        return true;

    }

    int count(){
        int count = 0;

        if(head == null ){
            return count;
        }

        Node current = head;

        while (current != null){
            ++count;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {

//        LinkedList<String>
        MyLinkedList list = new MyLinkedList();

        list.insert(new Node(6));
        list.insert(new Node(10));
        list.insert(new Node(17));
        list.insert(new Node(19));
        list.dump();
        list.insertBegin(new Node(10));



       list.dump();

//       list.remove(17);
//
//       System.out.println();
//
//       list.dump();
//
//        list.remove(6);
//
//        System.out.println();
//
//        list.dump();

//        list.remove(19);





    }


}
