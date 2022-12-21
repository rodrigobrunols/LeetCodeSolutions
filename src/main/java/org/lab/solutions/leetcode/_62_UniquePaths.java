package org.lab.solutions.leetcode;

import java.util.Arrays;

public class _62_UniquePaths {

    /**
     * Space O(n)
     * Time O(n)
     *
     * @param cost
     * @return
     * @return
     */
    public int solution(int m , int n) {
        int[][] options = new int[m][n];

        for(int[] arr : options) {
            Arrays.fill(arr, 1);
        }


        for(int row = 1; row < m;row++){
            for(int colum = 1; colum < n;colum++){
                options[row][colum] = options[row-1][colum] +  options[row][colum-1];
            }
        }

        return  options[m-1][n-1];

    }



    public static void main(String[] args) {
        System.out.println(new _62_UniquePaths().solution(3,2));
    }
}
