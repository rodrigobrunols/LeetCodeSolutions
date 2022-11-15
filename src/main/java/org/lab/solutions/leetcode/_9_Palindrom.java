package org.lab.solutions.leetcode;

import java.util.*;


/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class _9_Palindrom {

    /**
     * Uses a queue to put the elements until de middle.
     * When reach the midle start to pop the elements at the queue.
     * The order need to be equal to the rest elements left
     *
     * n = size of the integer
     * o(n) time complexity
     * o(n/2) space complecity
     *
     * @param x
     * @return
     */
    public boolean solution(int x) {
        var queue = new LinkedList<>();
        var numeroComoArray = String.valueOf(x).split("");
        int middle = (numeroComoArray.length/2);
        int contador = 0;

        while (contador < middle){
            queue.push(numeroComoArray[contador]);
            contador++;
        }
        if(numeroComoArray.length % 2 != 0){
            contador++;
        }

        while (contador < numeroComoArray.length){
            if (!queue.pop().equals(numeroComoArray[contador])) {
                return false;
            }
            contador++;
        }
        return true;
    }

    /**
     * Do not uses any extra data structure
     * Passing in the array and verify if the current index value is equal to the oposite index
     * relative to the end of the array
     *
     * @param x
     * Time O(n/2)
     * Space O(1)
     *
     * @return true if is palindrome
     */
    public boolean solution2(int x){
        if (x < 0) return false; //nao pode ser palidromo

        String str = String.valueOf(x);

        int start = 0;

        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }


    private static void teste(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        teste(i++);
        System.out.println(i);

    }
}
