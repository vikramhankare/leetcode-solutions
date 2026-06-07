// Last updated: 6/7/2026, 6:29:08 PM
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int[] suffixSum = new int[n];
        suffixSum[n-1] = nums[n-1];

        for(int i =n-2; i>=0; i--){
            suffixSum[i] = suffixSum[i+1] + nums[i];
        }

        int count = 0;

        for(int i =0; i<n-1; i++){
            if(nums[i] > suffixSum[i+1]/(n-i-1))
                count++;
        }

        return count;
    }
}