// Last updated: 6/7/2026, 6:29:17 PM
class Solution {
    public int reverseNumber(int n){
        int ans = 0;
        while(n!=0){
            int last_digit = n%10;
            ans = ans*10 + last_digit;
            n = n/10;
        }
        return ans;
    }


    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> lastOcc = new HashMap<>();

        lastOcc.put(reverseNumber(nums[0]), 0);
        int res = Integer.MAX_VALUE;

        int n = nums.length;
        for(int j = 1; j<n; j++){
            if(lastOcc.containsKey(nums[j]))
                res = Math.min(res, j - lastOcc.get(nums[j]));
            lastOcc.put(reverseNumber(nums[j]), j);
        }

        return (res == Integer.MAX_VALUE? -1: res);
    }
}