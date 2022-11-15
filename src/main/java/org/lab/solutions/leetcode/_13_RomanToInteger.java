package org.lab.solutions.leetcode;

/**
 * Solucao para o problema de conversao de algorismo romano em inteiro decimal
 *
 * Uma solucao é bem direta e deve seguir os passos a seguir
 *
 * 1.Da esquerda para direita converta o algarismo romano em decimal a
 * 2. Deve vericar os casos especiais
 *      2.1 Existe proximo numero b
 *      2.2 Proximo a >=b  ==  sum += a;
 *      2.3 a < b == sum+= b - a
 */
public class _13_RomanToInteger {
    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public int solution(String str) {
        int res = 0;

        for(int i=0; i < str.length();i++){

            int s1 = value(str.charAt(i)); //apenas converte valor de cada simbolo

            if(i + 1 < str.length()){
                int s2 = value(str.charAt(i+1));
                if(s1>= s2){//atual maior ou igual ao proximo adiciona o proximo ao valor do atual
                    res = res + s1;
                }else{//caso contrario subtrai o valor do atual do valor do proximo
                    res = res + s2 - s1;
                    i++;//nesse caso deve pular uma casa e passar para a proxima dezena
                }

            }else{
                res = res + s1; //soma ultimo algarismo do array
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new _13_RomanToInteger().solution("XXX"));
    }
}
