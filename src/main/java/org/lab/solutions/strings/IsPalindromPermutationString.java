package org.lab.solutions.strings;

/**
 * If it is a palidrom the word has at max one letters with odd number of ocurrency
 *
 * the solution: the code build a table where the key is the character code
 * and the value is the number of ocurrencies of each different character.
 *
 * After that, the code verify if there is more than one charachter with odd number of ocurrency
 *
 * been w a word and l a letter in w then l >= 'a' and l <= 'z'
 */
public class IsPalindromPermutationString {


    /**
     * Implementing this algorithm is fairly straightforward. We use a hash table to count how many
     * times each character appears.
     * Then, we iterate through the hash table and ensure that no more than one character has an odd count.
     * @param word word to be check
     * @return true if is palidrom, otherwide fause
     */
    public boolean solution(String word) {
        int[] ocorrencyTable = new int[Character.getNumericValue('z')-Character.getNumericValue('a') + 1];

        int numberOdds = 0;

        for (int i = 0; i < word.length(); i++) {
            int index = getCharNumber(word.charAt(i));

            ocorrencyTable[index]++;

            if(ocorrencyTable[index] % 2 == 1) {
                numberOdds++;
            }else {
                numberOdds--;
            }
        }

        return numberOdds <=1;
    }

    private static int getCharNumber(Character c){
        return Character.getNumericValue(c) - Character.getNumericValue('a');
    }



    public static void main(String[] args) {

        boolean solution = new IsPalindromPermutationString().solution(args[0]);

        System.out.println(solution);

    }
}
