// Last updated: 6/9/2026, 9:45:32 AM
// i just found max and min from whole array and then returned diff*k
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
12        return (max-min)*k;
13    }
14}
15