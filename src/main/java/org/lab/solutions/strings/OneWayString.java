package org.lab.solutions.strings;

import java.util.Arrays;

public class OneWayString {


    public boolean solution(String word, String otherWord) {
        if(Math.abs(word.length()-otherWord.length()) > 1) {
            return false;
        }

        String maiorPalavra = word.length() >= otherWord.length()?word :otherWord;

        int count = 0;

        int[] ocurrencyTable = createOcurrencyTable(maiorPalavra);

        for (char c :otherWord.toCharArray()) {
            int index = getCharNumber(c);
            ocurrencyTable[index]--;
        }

        for (int ocorrencia : ocurrencyTable) {
            count = count + ocorrencia;
        }

        return count>=1;

    }

    private int[] createOcurrencyTable(String word){
        int[] ocorrencyTable = new int[Character.getNumericValue('z')-Character.getNumericValue('a') + 1];

        for (int i = 0; i < word.length(); i++) {
            int index = getCharNumber(word.charAt(i));

            ocorrencyTable[index]++;
        }

        return  ocorrencyTable;
    }
    private static int getCharNumber(Character c){
        return Character.getNumericValue(c) - Character.getNumericValue('a');
    }

    public static void main(String[] args) {

        boolean solution = new OneWayString().solution(args[0], args[1]);

        System.out.println(solution);

    }
}
