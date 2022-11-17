package org.lab.solutions.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Problema deve verificar se a soma de dois numeros no array é igual ao target
 *
 * complemento = target - a
 *
 * solucao utilizando hashtable/hashmap com complemento = target - a e o valor igual ao indice
 *
 * 1. passar por a e verificar
 * 2. existe no mapa a chave que eh o complemento nesse caso retornar o valor da chave e o indice de a
 * 3. caso nao exista adicionar
 */
public class _1_TwoSum {

    /**
     * Time O(n) worst case
     * Space O(n) worst case
     *
     * @param nums array size n
     * @param target value as nums[i] + nums[j] = target  0 <= j < nums.length
     * @return
     */
    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }


    public static void main(String[] args) {

    }
}
