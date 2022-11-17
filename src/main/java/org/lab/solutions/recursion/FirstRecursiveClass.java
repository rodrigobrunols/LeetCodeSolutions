package org.lab.solutions.recursion;

import org.lab.solutions.linkedlist.SumLists;

public class FirstRecursiveClass {


    public  static void printRecursive(int n, String name){
        if(n == 0) return;
        printRecursive(n-1,name);
        System.out.println(n+ name);
    }

    public static int sumnumbers(int n, int sum){
        if(n==0){
            return sum;
        }
        System.out.println(sum);
        return sumnumbers(n-1, ++sum);
    }

    public static void main(String[] args) {
      System.out.println(sumnumbers(10,0));

    }
}
