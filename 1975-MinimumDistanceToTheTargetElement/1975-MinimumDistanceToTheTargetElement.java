// Last updated: 6/7/2026, 6:30:29 PM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            if(nums[i] == target){
                ans = Math.min(ans, Math.abs(i-start));
            }
        }

        return ans;
    }
}