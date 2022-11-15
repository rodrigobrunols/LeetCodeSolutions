package org.lab.solutions.leetcode;


import java.util.Arrays;

/**
 *Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 */
public class _58_LenthOfLastWord {

    /**
     *
     * @param s
     * @return
     */
    public int solution(String s) {

//        return s.substring(s.lastIndexOf(" "),s.length()-1).length();
        String[] s1 = s.split(" ");

        return s1[s1.length-1].length();

    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println(new _58_LenthOfLastWord().solution( ""));
    }
}
