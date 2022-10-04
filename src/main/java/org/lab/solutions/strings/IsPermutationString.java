package org.lab.solutions.strings;

import java.util.Arrays;

public class IsPermutationString {

 private String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return String.valueOf(content);
    }
    private  boolean solution(String a, String b){

        if(a.length() != b.length()){
            return false;
        }
        return sort(a).equals(sort(b));
    }
    public static void main(String[] args) {

        System.out.println(new IsPermutationString().solution(args[0] , args[1]));
    }

}
