// Last updated: 6/7/2026, 6:29:04 PM
class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        Integer[] prefixGcd = new Integer[n];

        int max = nums[0];
        int a = 0;
        int b = 0;

        for(int i = 0; i<n; i++){
            max = Math.max(max, nums[i]);

            a = Math.max(nums[i], max);
            b = Math.min(nums[i], max);
            
            prefixGcd[i] = gcd(a, b);
        }

        Arrays.sort(prefixGcd);

        int i = 0;
        int j = n-1;
        long ans = 0;
        
        
        while(i<j){
            a = Math.max(prefixGcd[i], prefixGcd[j]);
            b = Math.min(prefixGcd[i], prefixGcd[j]);
            ans += gcd(a, b);
            i++;
            j--;
        }

        return ans;
    }

    public int gcd(int a, int b){
        if(b == 0)
            return Math.abs(a);
        return gcd(b, a%b);
    }

    
}