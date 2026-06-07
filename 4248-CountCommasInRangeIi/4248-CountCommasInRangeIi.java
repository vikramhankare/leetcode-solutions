// Last updated: 6/7/2026, 6:29:02 PM
class Solution {
    public long countCommas(long n) {
        long num = n;
        int count = 0;

        while(num>0){
            count++;
            num /= 10;
        }

        long ans = 0;
        long base = 1000;

        while(base<=n){
            ans += (n-base+1);
            base *= 1000;
            
        }

        return ans;
    }
}