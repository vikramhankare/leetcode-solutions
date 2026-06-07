// Last updated: 6/7/2026, 6:28:32 PM
class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int count = 0;

        while(i<j){
            while(i<n && nums[i] != 0){
                i++;
            }

            while(j>=0 && nums[j] == 0){
                j--;
            }

            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                count++;
                i++;
                j--;
            }
            
        }
        // if(count>0)
        //     return count-1;
        // else
            return count;
    }
}