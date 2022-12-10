package org.lab.solutions.leetcode;


import java.util.LinkedList;
import java.util.Stack;

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * Example 2:
 *
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 * Example 3:
 *
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 200
 * s and t only contain lowercase letters and '#' characters.
 */
public class _844_BackspaceStringCompare {

    /**
     *
     * Space O(m+n)
     * Time O(m+n)
     *
     * @param s string size n
     * @param t string size m
     *
     * @return
     */
    public boolean solution(String s, String t) {

        return aux(s).equals(aux(t));
    }

    public boolean solution2(String s, String t) {

        return aux2(s).equals(aux2(t));
    }

    public String aux(String s){
        StringBuilder sbs = new StringBuilder();
        int ignore = 0;

        for(int i = s.length()-1 ; i>=0; i--){
            if(s.charAt(i) != '#'){
                if(ignore==0){
                    sbs.append(s.charAt(i));
                }
                else{
                    ignore--;
                    continue;
                }
            }else{
                ignore++;
            }
        }

        return sbs.toString();
    }

    /**
     * Usin Stack
     *
     * Space O(n+m)
     * Time O(n+m)
     *
     * @param s
     * @return
     */
    public String aux2(String s){
        Stack<Character> stack = new Stack();

        for(Character c : s.toCharArray()){
            if(c!= '#'){
                stack.push(c);
            }else if (!stack.isEmpty()){
                stack.pop();
            }
        }

        return String.valueOf(stack);
    }


    public static void main(String[] args) {

        System.out.println(new _844_BackspaceStringCompare().solution("ab##", "c#d#"));
        System.out.println(new _844_BackspaceStringCompare().solution2("ab##", "c#d#"));
    }
}
