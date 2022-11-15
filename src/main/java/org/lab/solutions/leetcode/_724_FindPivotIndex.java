package org.lab.solutions.leetcode;


import java.util.Arrays;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class _724_FindPivotIndex {

    /**
     * @param nums The array represents the integer
     * @return The pivot index
     * <p>
     * Time O(n) worst case
     * Space O(1) worst case
     */
    public int solution(int[] nums) {
        var leftsum = 0;
        var rightsum = 0;
        var pivot = 0;
        for (int i = nums.length - 1; i > pivot; i--) {//
            rightsum += nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            if (j > 0) {
                leftsum += nums[j - 1];

                rightsum -= nums[j];
            }
            if (leftsum == rightsum) {
                return j;
            }
        }
        return -1;
    }

    public int solution2(int[] nums) {
        var leftsum = 0;
        var rightsum = 0;

        for(int i: nums){
            rightsum+=i ; //calculate rightsum
        }

        for(int j=0; j < nums.length; j++){
            if(leftsum == rightsum - leftsum - nums[j]) {
                return j;
            }
            leftsum += nums[j-1];
        }
        return -1;
    }



        /**
         * @param args
         */
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        System.out.println(new _724_FindPivotIndex().solution(digits));
    }
}
