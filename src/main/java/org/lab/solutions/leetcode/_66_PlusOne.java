package org.lab.solutions.leetcode;


import java.util.Arrays;

/**
 *You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 */
public class _66_PlusOne {

    /**
     *
     * @param digits The array represents the integer
     * @return The array represents the integer result
     *
     * Time O(n) worst case
     * Space O(n) worst case
     *
     */
    public int[] solution(int[] digits) {
        int n = digits.length;
        int index = n - 1;

        while(index >= 0){

            if(digits[index] < 9){//just increment current number
                digits[index]++;

                return digits;
            }else{ //need to increment previous number
                digits[index] = 0;

                index--;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] solution = new _66_PlusOne().solution(digits);
        Arrays.toString(solution);
    }
}
