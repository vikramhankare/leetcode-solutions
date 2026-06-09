// Last updated: 6/9/2026, 9:48:44 AM
// We are allowed to overlap and repeat choices, the absolute best strategy is to just pick a subarray that contains both extremes(min and max), and just pick it k times!
1class Solution {
2
3    public long maxTotalValue(int[] nums, int k) {
4        long min = nums[0];
5        long max = nums[0];
6        int n = nums.length;
7        for (int i = 0; i < n; i++) {
8            min = Math.min(min, nums[i]);
9            max = Math.max(max, nums[i]);
10        }
11
12        return (max - min) * k;
13    }
14}
15