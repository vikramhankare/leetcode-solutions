// Last updated: 6/7/2026, 6:29:14 PM
class Solution {
    public int minLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();
        while(i<=j && j<n){
        
            int val = nums[j];
            
            freq.put(val, freq.getOrDefault(val, 0) + 1);
                
            if(freq.get(val) == 1){
                sum += val;
            }

            while(sum>=k && i<=j){
                ans = Math.min(ans, j-i+1);
                int leftVal = nums[i];
                freq.put(leftVal, freq.get(leftVal) - 1);
                if(freq.get(leftVal) == 0)
                    sum -= leftVal;
                i++;
            }
            j++;
        }

        return (ans == Integer.MAX_VALUE)?-1:ans;
    }
}