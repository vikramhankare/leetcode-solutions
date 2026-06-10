// Last updated: 6/10/2026, 8:14:04 AM
class Solution {

    public long maxTotalValue(int[] nums, int k) {
        long min = nums[0];
        long max = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return (max - min) * k;
    }
}
