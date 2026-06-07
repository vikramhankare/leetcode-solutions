// Last updated: 6/7/2026, 6:28:43 PM
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int count = 0;
            
        for(int i = 0; i<n; i++){
            if(nums[i]%2 != 0){
                for(int j = i+1; j<n; j++){
                    if(nums[j]%2 == 0)
                        count++;
                }
            }
            else{
                for(int j = i+1; j<n; j++){
                    if(nums[j]%2 != 0)
                        count++;
                }
            }

            ans[i] = count;
            count = 0;
        }

        return ans;
    }
}