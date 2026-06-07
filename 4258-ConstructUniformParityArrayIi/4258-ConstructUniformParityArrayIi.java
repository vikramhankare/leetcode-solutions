// Last updated: 6/7/2026, 6:28:58 PM
class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        boolean hasOdd = false;
        int minOdd = Integer.MAX_VALUE;
        
        for(int i = 0; i<n; i++){
            if(nums1[i]%2 == 1){
                minOdd = Math.min(minOdd, nums1[i]);
                hasOdd = true;
            }
        }

        if(hasOdd == false)
            return true;

        for(int i = 0; i<n; i++){
            if(nums1[i]%2 == 0){
                if(nums1[i] - minOdd < 1)
                    return false;
            }
        }

        return true;
    }
}