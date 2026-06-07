// Last updated: 6/7/2026, 6:29:22 PM
class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i = 1; i<n; i++){
            max = Math.max(max, nums[i]);
        }

        int moves= 0;
        for(int i = 0; i<n; i++){
            moves += Math.abs(max-nums[i]);
        }

        return moves;
        
    }
}