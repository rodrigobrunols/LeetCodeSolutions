package org.lab.solutions.leetcode;


import java.util.Arrays;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 */
public class _1480_RunningSum {

    /**
     *
     * @param nums The array represents the integer
     * @return The array with current sum
     *
     * Time O(n) worst case
     * Space O(n) worst case
     *
     */
    public int[] solution(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }

        return nums;
    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] digits = {1,2,3,4};
        int[] solution = new _1480_RunningSum().solution(digits);
        Arrays.toString(solution);
    }
}
