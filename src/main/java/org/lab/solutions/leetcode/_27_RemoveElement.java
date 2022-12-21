package org.lab.solutions.leetcode;

public class _27_RemoveElement {

    /**
     * Space O(n)
     * Time O(1)
     *
     * @param nums initial array
     * @param val value to remove from array
     * @return length of new array
     */
    public int solution(int[]  nums, int val) {
        int writer = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val)
                nums[writer++] = nums[i];
        }
        return  writer;
    }



    public static void main(String[] args) {
        int[]  nums = {3,2,2,3};
        System.out.println(new _27_RemoveElement().solution(nums,3));
    }
}
