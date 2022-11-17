package org.lab.solutions.leetcode;

import java.util.*;


/**
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Every close bracket has a corresponding open bracket of the same type.

 Example 1:

 Input: s = "()"
 Output: true
 Example 2:

 Input: s = "()[]{}"
 Output: true
 Example 3:

 Input: s = "(]"
 Output: false
 */
public class _20_ValidParentheses {

    private static Map<Character, Character> parenthesesMap = Map.of('{','}','[',']','(',')');

    /**
     * Time: O(n)
     * Space: O(n)
     *
     * @param s String size n
     * @return
     */
    public boolean solution(String s) {

        Stack<Character> openParenthesesStack = new Stack<Character>();

        for(char c : s.toCharArray()){
            if(parenthesesMap.containsKey(c)){
                openParenthesesStack.push(c);
            }else{
                if(openParenthesesStack.isEmpty()) return false;

                char openParentheses = openParenthesesStack.pop();

                if(parenthesesMap.get(openParentheses) != c) return false;
            }
        }

        return openParenthesesStack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(new _20_ValidParentheses().solution("{}"));

    }
}
