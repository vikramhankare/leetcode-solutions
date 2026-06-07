// Last updated: 6/7/2026, 6:28:29 PM
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int itr = 0;
        for(int i = 0; i<n; ){
            if(map.get(nums[i]) <= k){
                int count = map.get(nums[i]);
                while(count-- > 0){
                    ans[itr++] = nums[i];
                }
            }
            else{
                int count = k;
                while(count-- > 0){
                    ans[itr++] = nums[i];
                }
            }
            int skipEle = nums[i];
            while(i<n && nums[i] == skipEle){
                i++;
            }
        }

        int nonZero = n;
        for(int i = n-1; i>=0; i--){
            if(ans[i] == 0)
                nonZero--;
        }

        int[] ans2 = new int[nonZero];
        for(int i = 0; i<nonZero; i++){
            ans2[i] = ans[i];
        }
        
        return ans2;
    }
}