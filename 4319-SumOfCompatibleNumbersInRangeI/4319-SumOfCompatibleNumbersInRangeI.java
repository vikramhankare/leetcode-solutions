// Last updated: 6/7/2026, 6:28:33 PM
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        for(int x = n-k; x<=n+k; x++){
            if(Math.abs(n-x)<=k && (n&x) == 0 && x>0)
                sum += x;
        }

        return sum;
    }

    
}