// Last updated: 6/7/2026, 6:31:07 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        
        int[] dp = new int[n];
        
        // initialize dp with 1
        for(int i = 0; i < n; i++){
            dp[i] = 1;
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        
        int ans = 0;
        for(int val : dp){
            ans = Math.max(ans, val);
        }
        
        return ans;
    }
}