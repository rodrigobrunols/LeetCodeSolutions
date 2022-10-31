package org.lab.solutions.orderAndSearch;

import java.security.cert.X509Certificate;

public class BinarySearchRecursive {

    public int search(int[] numbers, int numberToFind, int begin, int end ){
        if(begin > end){
            return -1;
        }
        int middle = (begin + end )/2;

        System.out.println("begin " + begin + " end " + end+ " mid "+middle );

        if(numberToFind > numbers[middle]){
            return search(numbers,numberToFind,middle + 1,end);
        } else if (numberToFind < numbers[middle]) {
            return search(numbers,numberToFind,begin,middle-1);
        }else {
            return middle;
        }
    }

    public static void main(String[] args) {

        int[] array = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("result " + new BinarySearchRecursive().search(array,9,0,array.length-1));
        System.out.println("result " + new BinarySearchRecursive().search(array,0,0,array.length-1));

        System.out.println("result " + new BinarySearchRecursive().search(array,3,0,array.length-1));
        System.out.println("result " + new BinarySearchRecursive().search(array,7,0,array.length-1));

        System.out.println("result " + new BinarySearchRecursive().search(array,11,0,array.length-1));

    }

}
