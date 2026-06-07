// Last updated: 6/7/2026, 6:28:38 PM
class Solution {
    public int countKthRoots(int l, int r, int k) {
        int rightCount = BS(r, k);
        int leftCount = BS(l-1, k);
        int ans = rightCount - leftCount;
        
        if(l==0)
            ans++;
        
        return ans;
    }

    private int BS(int limit, int k){
        if(limit < 1)
            return 0;

        int start = 1;
        int end = limit;
        int ans = 0;

        while(start<=end){
            int mid = start+(end-start)/2;

            long val = power(mid, k, limit);

            if(val <= limit){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
                
            }
        }

        return ans;
    }

    private long power(long base, int exp, int limit){
        long result = 1;

        for(int i = 0; i<exp; i++){
            result *= base;

            if(result > limit){
                return limit + 1L;
            }
        }

        return result;
    }
}