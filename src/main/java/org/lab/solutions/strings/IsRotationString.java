package org.lab.solutions.strings;

import java.util.Arrays;

/**
 * StringRotation:Assumeyouhaveamethodi5Sub5tringwhichchecksifonewordisasubstring of another.
 * Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one call to i5Sub5tring
 * (e.g., "waterbottle" is a rotation of" erbottlewat").
 */
public class IsRotationString {

 private String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return String.valueOf(content);
    }
    private  boolean solution(String s1, String s2){

     if(s1.length() == s2.length() && s1.length() > 0){

         return isSubstring(s1+s1,s2);

     }
        return false;
    }

    private boolean isSubstring(String s1, String s2) {
           return true;
    }

    public static void main(String[] args) {

        System.out.println(new IsRotationString().solution(args[0] , args[1]));
    }

}
