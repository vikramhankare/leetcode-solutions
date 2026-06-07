// Last updated: 6/7/2026, 6:31:12 PM
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            // already sorted
            if (nums[start] <= nums[end]) {
                return nums[start];
            }

            int mid = start + (end-start)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            
            if(nums[mid] <= nums[prev] && nums[mid]<=nums[next]){
                return nums[mid];
            }
            else if(nums[start] <= nums[mid]){
                start = mid+1;
            }
            else if(nums[mid] < nums[end])
                end = mid-1;
        }

        return -1;
    }
}