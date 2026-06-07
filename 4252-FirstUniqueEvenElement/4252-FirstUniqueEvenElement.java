// Last updated: 6/7/2026, 6:29:01 PM
class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){
            if(freq.get(nums[i])==null)
                freq.put(nums[i], 1);
            else 
                freq.put(nums[i], freq.get(nums[i])+1);
        }

        int ans = -1;
        for(int i = 0; i<n; i++){
            if(nums[i]%2 == 0 && freq.get(nums[i]) == 1){
                ans = nums[i];
                break;
            }
        }

        return ans;
    }
}