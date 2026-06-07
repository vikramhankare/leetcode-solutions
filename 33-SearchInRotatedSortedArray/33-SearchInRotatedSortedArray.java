// Last updated: 6/7/2026, 6:31:22 PM
class Solution {

    public int BS(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid+1;
            else 
                end = mid-1;
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mini = -1;

        if(nums[start] <=  nums[end])
            mini = 0;
        else{
            while(start<=end){
                int mid = start+(end-start)/2;
                if(mid>0 && mid<n-1 && nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1]){
                    mini = mid;
                    break;
                }
                else if(nums[mid] >= nums[0])
                    start = mid+1;
                else
                    end = mid-1;
            }

            if(mini == -1)
                mini = start;
        }

        

        return Math.max(BS(nums, target, 0, mini-1), BS(nums, target, mini, n-1));
        
    }
}