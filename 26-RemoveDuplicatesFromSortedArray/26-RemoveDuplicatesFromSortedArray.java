// Last updated: 6/7/2026, 6:31:26 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) 
            return 0;

        int index = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[index - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;        
    }
}