package org.lab.solutions.leetcode;

public class _746_MinCostClimbingStairs {

    /**
     * Space O(n)
     * Time O(n)
     *
     * @param cost
     * @return
     * @return
     */
    public int solution(int[] cost) {
        int[] dp = new int[cost.length];
        int n = cost.length;

        for (int i = n - 1; i >= 0; i--) {
            int costi1 = 0;
            int costi2 = 0;
            if (i + 1 < n) {
                costi1 = dp[i + 1];
            }
            if (i + 2 < n) {
                costi2 = dp[i + 2];
            }
            dp[i] = cost[i] + Math.min(costi1, costi2);
        }
        return Math.min(dp[0], dp[1]);
    }

    /**
     * Space O(n)
     * Time O(n)
     *
     * @return
     */
    public int solution2(int[] cost) {
        // The array's length should be 1 longer than the length of cost
        // This is because we can treat the "top floor" as a step to reach
        int minimumCost[] = new int[cost.length + 1];

        // Start iteration from step 2, since the minimum cost of reaching
        // step 0 and step 1 is 0
        for (int i = 2; i < minimumCost.length; i++) {
            int takeOneStep = minimumCost[i - 1] + cost[i - 1];
            int takeTwoSteps = minimumCost[i - 2] + cost[i - 2];
            minimumCost[i] = Math.min(takeOneStep, takeTwoSteps);
        }

        // The final element in minimumCost refers to the top floor
        return minimumCost[minimumCost.length - 1];
    }

    /**
     * Space O(1)
     * Time O(n)
     *
     * @param cost array de custos
     * @return
     */
    public int solution3(int[] cost) {
        int onestep = 0;
        int twostep = 0;

        for (int i = 2; i < cost.length + 1; i++) {
            int temp = onestep;
            onestep = Math.min(onestep + cost[i - 1], twostep + cost[i - 2]);
            twostep = temp;
        }

        return onestep;
    }


    public static void main(String[] args) {
        System.out.println(new _746_MinCostClimbingStairs().solution(new int[]{10, 15, 20}));
    }
}
