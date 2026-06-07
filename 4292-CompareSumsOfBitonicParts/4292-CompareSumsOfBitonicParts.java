// Last updated: 6/7/2026, 6:28:44 PM
class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int peakIndex = -1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] < nums[mid+1])
                start = mid + 1;
            else
                end = mid;
        }
        peakIndex = start;

        long sumLeft = 0;
        for(int i = 0; i<=peakIndex; i++){
            sumLeft = sumLeft + nums[i];
        }

        long sumRight = 0;
        for(int i = peakIndex; i<n; i++){
            sumRight = sumRight + nums[i];
        }

        if(sumLeft > sumRight)
            return 0;
        else if(sumLeft < sumRight)
            return 1;
        else 
            return -1;
    }
}