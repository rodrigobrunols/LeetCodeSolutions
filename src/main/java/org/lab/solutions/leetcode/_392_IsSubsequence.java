package org.lab.solutions.leetcode;


import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 100
 * 0 <= t.length <= 104
 * s and t consist only of lowercase English letters.
 * <p>
 * <p>
 * Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one
 * by one to see if t has its subsequence. In this scenario, how would you change your code?
 */
public class _392_IsSubsequence {

    /**
     *
     * @param s source string size n;
     * @param t target string size m and m>n
     * @return
     */
    public boolean solution(String s, String t) {
        Integer leftBound = s.length(), rightBound = t.length();

        Integer pLeft = 0, pRight = 0;

        while (pLeft < leftBound && pRight < rightBound) {
            // move both pointers or just the right pointer
            if (s.charAt(pLeft) == t.charAt(pRight)) {
                pLeft += 1;
            }
            pRight += 1;
        }

        //aaa
        return pLeft == leftBound;
    }






    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new _392_IsSubsequence().solution("egg", "add"));
    }
}
