// Last updated: 6/7/2026, 6:30:00 PM
class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            if(nums[i] != i+1)
                return false;       
        }

        if(nums[n-1]!= n-1 || nums[n-2]!= n-1)
            return false;

        return true;   
    }
}