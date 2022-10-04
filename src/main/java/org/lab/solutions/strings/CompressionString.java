package org.lab.solutions.strings;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3.
 * If the "compressed" string would not become smaller than the original string, your method should return the original string.
 * You can assume the string has only uppercase and lowercase letters (a - z)
 */
public class CompressionString {

    /**
     * At first glance, implementing this method seems fairly straightforward, but perhaps a bit tedious.
     * We iterate through the string, copying characters to a new string and counting the repeats.
     * At each iteration, check if the current character is the same as the next character.
     * If not, add its compressed version to the result.
     * @param original
     * @return
     */
    public String solution(String original) {
        StringBuilder compressed = new StringBuilder(); //faster the StringBuffer

        int countConsecutive = 0;

        for (int i = 0; i < original.length(); i++) {
            countConsecutive++;
           if( i+1 >= original.length() || original.charAt(i+1)!= original.charAt(i)){
               compressed.append(original.charAt(i)).append(countConsecutive) ;
               countConsecutive = 0;
           }
           if(compressed.length() > original.length()){
               return original;
           }
        }

        return compressed.toString();
    }


    public static void main(String[] args) {

        System.out.println(new CompressionString().solution(args[0]));

    }
}
