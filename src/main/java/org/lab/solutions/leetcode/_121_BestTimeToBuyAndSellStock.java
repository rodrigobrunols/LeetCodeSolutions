package org.lab.solutions.leetcode;


import java.util.Arrays;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */
public class _121_BestTimeToBuyAndSellStock {

    /**
     * @param prices The array represents the integer
     * @return The best profit
     * <p>
     * Time O(n)
     * Space O(1)
     */
    public int solution(int[] prices) {
        int bestValueBuy = Integer.MAX_VALUE;
        int bestProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < bestValueBuy) {//melhor dia para comprar;
                bestValueBuy = prices[i];
            }
            bestProfit = Math.max(bestProfit, prices[i] - bestValueBuy);//verifica se a venda hoje é melhor que a venda realizada em dia anterior
        }
        return bestProfit;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int solution = new _121_BestTimeToBuyAndSellStock().solution(prices);

        System.out.println(solution);
    }
}
