package org.lab.solutions.leetcode;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
 *
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 * Example 2:
 *
 * Input: s = "a"
 * Output: 1
 * Explanation: The longest palindrome that can be built is "a", whose length is 1.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2000
 * s consists of lowercase and/or uppercase English letters only.
 */
public class _409_LongestPalindrom {

    /**
     *
     * @param nums The array represents the integer
     * @return The array with current sum
     *
     * Time O(n)
     * Space O(1)
     *
     */
    public int solution(String s) {
        int[] hash = new int[128];

        for(char c : s.toCharArray()){
            hash[c]++;
        }

        int odds = 0;
        int evens = 0;

        for(int count  : hash){
            if(count % 2 == 0){
                evens += count;
            }else {
                evens += count -1;
                odds++;
            }
        }

        int longest = evens;

        longest += odds>0?1:0;

        return longest;
    }

    /**
     *
     * @param s String size n
     * @return  the lenght of longest palindrom
     *
     * Time O(n)
     * Space O(log(n))
     *
     */
    private int solution2(String s){
        Set<Character> letters = new HashSet();

        int longestPalindrom = 0;

        for(char c : s.toCharArray()){
            if(letters.contains(c)){
                longestPalindrom = longestPalindrom + 2;
                letters.remove(c);
            }else{
                letters.add(c);
            }

        }

        if(!letters.isEmpty()) longestPalindrom++;

        return longestPalindrom;
    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       String s = s = "abccccdd";

        int solution = new _409_LongestPalindrom().solution(s);

        System.out.println(solution);
    }
}
