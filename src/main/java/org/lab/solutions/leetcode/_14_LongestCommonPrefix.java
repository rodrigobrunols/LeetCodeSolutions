package org.lab.solutions.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 *
 */
public class _14_LongestCommonPrefix {

    /**
     * Time O(s) where is s the sum of all characters in array.
     *
     * Space O(1)
     *
     * @param strs string array size n
     * @return
     */
    public String solution(String[] strs) {
        if (strs.length == 0) return "";

        String prefix =  strs[0];

        for(int i=1;i< strs.length; i++ ){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }


    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(new _14_LongestCommonPrefix().solution(strs));
    }
}
