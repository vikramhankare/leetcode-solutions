// Last updated: 6/7/2026, 6:29:27 PM
class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;

        if(n == 1)
            return nums[0];

        int evenSum = 0;
        int OddSum = 0;
        
        for(int i = 0; i<n; i+=2){
            evenSum += nums[i];
        }

        for(int i = 1; i<n; i+=2){
            OddSum -= nums[i];
        }

        return evenSum + OddSum;
    }
}