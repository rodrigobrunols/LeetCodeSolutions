package org.lab.solutions.leetcode;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 < nums[i], target < 104
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 */
public class _704_BinarySearch {

    /**
     * Time O(logn)
     * Space O (logn)
     *
     * @param nums array size n
     * @param target number to find
     *
     * @return index of target if exists else return -1;
     */
    public int solution(int[] nums, int target) {

        return search(nums, target,0,nums.length-1);

    }

    /**
     *
     * @param nums
     * @param target
     * @param begin
     * @param end
     * @return
     */
    public int search(int[] nums, int target,int begin, int end) {
        int mid = (begin + end) /2;

        if(end < begin) return -1;

        if(nums[mid] == target) return mid;

        else if(target < nums[mid]) return search(nums,target,begin,mid -1);

        else if(target > nums[mid]) return search(nums,target,mid+1,end);

        else return -1;
    }

    public static void main(String[] args) {

        System.out.println(new _704_BinarySearch().solution(new int[]{-1, 0, 3, 5, 9, 12},9));

    }
}
