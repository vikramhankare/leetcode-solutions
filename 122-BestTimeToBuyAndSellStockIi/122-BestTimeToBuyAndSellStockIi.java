// Last updated: 6/7/2026, 6:31:13 PM
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        // Sum all positive adjacent differences.
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}