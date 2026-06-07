// Last updated: 6/7/2026, 6:29:06 PM
class Solution {
    public int toggleState(int state){
        if(state == 1)
            return 2;
        else return 1;
    }
    
    public int scoreDifference(int[] nums) {
        int active = 1;
        int scoreP1 = 0;
        int scoreP2 = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(nums[i]%2 != 0){
                active = toggleState(active);
            }
            if((i+1)%6 == 0){
                active = toggleState(active);
            }

            if(active == 1){
                scoreP1 += nums[i];
            }
            else if(active == 2){
                scoreP2 += nums[i];
            }
        }

        return scoreP1 - scoreP2;
        
    }
}