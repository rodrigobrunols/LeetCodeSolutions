package org.lab.solutions.orderAndSearch;

import javax.sound.midi.MidiChannel;

public class BinarySearch {

    public int search(int[] intArray, int numberToFind){

        int begin = 0;
        int end = intArray.length -1;
        int mid;

        while (begin <= end){
            mid = (begin + end)/2;
            System.out.println("begin " + begin + " end " + end+ " mid "+mid );
            if(numberToFind > intArray[mid]){
                begin = mid+1;
            } else if (numberToFind < intArray[mid]) {
                end = mid;
            }else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(new BinarySearch().search(numbers, 3));
        System.out.println(new BinarySearch().search(numbers, 7));
        System.out.println(new BinarySearch().search(numbers, 9));
        System.out.println(new BinarySearch().search(numbers, 0));
        System.out.println(new BinarySearch().search(numbers, 10));

    }
}
