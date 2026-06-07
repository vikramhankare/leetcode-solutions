// Last updated: 6/7/2026, 6:29:30 PM
class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        boolean allZero = true;

        for(int num: nums){
            totalXor ^= num;
            if(num != 0)
                allZero = false;
        }

        if(allZero)
            return 0;

        if(totalXor != 0)
            return nums.length;

        return nums.length-1;
    }
}