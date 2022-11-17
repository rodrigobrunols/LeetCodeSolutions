package org.lab.solutions.leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving
 * the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * <p>
 * Input: s = "paper", t = "title"
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */
public class _205_IsomorphicString {

    /**
     * @param s string size n
     * @param t string size n
     * @return true if s and t are isomorphic
     * <p>
     * <p>
     * Time Complexity O(n)
     * Space Complexity O(n) or O(1) because the set of characters is fixed ?
     */
    public boolean solution(String s, String t) {
        var charmap = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            Character mappedchar = charmap.get(s.charAt(i));

            if (mappedchar != null && mappedchar != t.charAt(i)) return false;

            if (mappedchar == null && charmap.containsValue(t.charAt(i))) return false;

            charmap.put(s.charAt(i), t.charAt(i));
            s.substring();
        }

        return true;
    }

    /**
     * @param s string size n
     * @param t string size n
     * @return true if s and t are isomorphic
     * <p>
     * <p>
     * Time Complexity O(n)
     * Space Complexity O(n) or O(1) because the set of characters is fixed ?
     */
    public boolean solution2(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (Integer i = 0; i < s.length(); i++) {
            if (map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
                return false;
        }
        return true;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new _205_IsomorphicString().solution("egg", "add"));
    }
}
