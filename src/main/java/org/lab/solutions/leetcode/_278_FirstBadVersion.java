package org.lab.solutions.leetcode;


/**
 *You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 *
 * Input: n = 1, bad = 1
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= bad <= n <= 231 - 1
 */
public class _278_FirstBadVersion {
    /**
     *
     * Time O(logn)
     * Space O(1)
     * @param n array of integers size n {1....n}
     *
     * @return firt bad version
     */
    public int solution(int n) {
        int left = 1;

        int right = n;

        while(right < left){

            int mid = left + (right - left) /2; //avoid integer overflow

            if(isBadVersion(mid)){ //all version to the right are bad
                right = mid;
            }else {
                left = mid + 1;//all to the left are good
            }
        }

        return left;
    }


    private boolean isBadVersion(int n ){
        return n == 4 ;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println((int) 4/2);
    }
}
