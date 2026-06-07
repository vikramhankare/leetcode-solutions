// Last updated: 6/7/2026, 6:28:56 PM
class Solution {
    public long minOperations(int[] nums) {

        int n = nums.length;
        long count = 0;
        
        int i = 0;
        while(i<=n-2){
            if(nums[i] > nums[i+1])
                count = count + (nums[i] - nums[i+1]);
            i++;
        }

        // for(int i  =1; i<n; i++){
        //     long prev = nums
        // }

        return count;
    }
}