package org.lab.solutions.hashtable;

import com.sun.source.tree.ReturnTree;
import org.lab.solutions.stacksequeues.Animal;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTableWithLinkedList<K,V> {

    private ArrayList<LinkedListNode<K,V>> table;

    private static class  LinkedListNode<K,V> {

        public LinkedListNode<K,V> next;

        public LinkedListNode<K,V> prev;

        public K key;

        public V value;

        public LinkedListNode(LinkedListNode<K, V> next, LinkedListNode<K, V> prev, K key, V value) {
            this.next = next;
            this.prev = prev;
            this.key = key;
            this.value = value;
        }

        public LinkedListNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTableWithLinkedList(int capacity) {
        table = new ArrayList<LinkedListNode<K,V>>();

        table.ensureCapacity(capacity);

        for(int i =0; i < capacity; i++){
            table.add(null);
        }
    }

    public void put(K key, V value){
        var node = getNodeForTheKey(key);

        if(node != null){
            node.value = value;
            return;
        }

        node = new LinkedListNode<K,V>(key,value);
        
        var index = getIndexForTheKey(key);

        if(table.get(index) != null){
            node.next = table.get(index);
            node.next.prev = node; //inclui no comeco da lista
        }

        table.set(index,node);
    }


    public void remove(K key){
        var node = getNodeForTheKey(key);

        if(node.prev != null){
            node.prev.next = node.next;
        }else {
            var hashkey = getIndexForTheKey(key);
            table.set(hashkey,node.next);
        }

        if(node.next != null){
            node.next.prev = node.prev;
        }

    }

    public V get(K key){
        var retorno = getNodeForTheKey(key);
        return retorno==null? null: retorno.value;
    }


    private int getIndexForTheKey(K key) {
        return Math.abs(key.hashCode() % table.size());// o % garante que o resultado está dentro do espaço do array
    }

    private LinkedListNode<K,V> getNodeForTheKey(K key) {
        int index = getIndexForTheKey(key);

        var current = table.get(index);

        while (current!= null){
            if(current.key == key){
                return current;
            }
            current = current.next;
        }

        return null;
    }


}
