// Last updated: 6/7/2026, 6:29:38 PM
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
       int nq = queries.length;

       for(int i = 0 ; i<nq; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];
            int idx = l;

            while(idx <= r){
                nums[idx] = (int)((1L*nums[idx]*v) % (1000000007));
                idx += k;
            }
       }

        int n = nums.length;
        int ans = nums[0];
        for(int i = 1 ; i<n; i++){
            ans = ans ^ nums[i];
        }

        return ans;
    }
}