// Last updated: 6/7/2026, 6:28:46 PM
class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        if(n == 1){
            ans.add(nums[0]);
            return ans;
        }
        
        ans.add(nums[0]);
        
        for(int i = 1; i<n-1; i++){

            //checking with every ele in right side
            boolean rightValid = true;
            for(int j = i+1; j<n; j++){
                if(nums[j]>=nums[i]){
                    rightValid = false;
                    break;
                }
            }


            //checking with every ele in left side
            boolean leftValid = true;
            for(int j = i-1; j>=0; j--){
                if(nums[j]>=nums[i]){
                    leftValid = false;
                    break;
                }
            }

            if(rightValid == true || leftValid == true)
                ans.add(nums[i]);
            
        }

        ans.add(nums[n-1]);

        return ans;
    }
}