// Last updated: 6/7/2026, 6:29:12 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        PriorityQueue<Integer> MaximumK = new PriorityQueue<>();
        PriorityQueue<Integer> MinimumK = new PriorityQueue<>(Comparator.reverseOrder());

        int n = nums.length;
        for(int i =0; i<n; i++){
            MaximumK.add(nums[i]);
            if(MaximumK.size()>k)
               MaximumK.poll();
                  
            MinimumK.add(nums[i]);
            if(MinimumK.size()>k)
               MinimumK.poll();
        }

        int sumMaxK = 0;
        int sumMinK = 0;

        while(MaximumK.size()>0){
            sumMaxK += MaximumK.poll();
        }

        while(MinimumK.size()>0){
            sumMinK += MinimumK.poll();
        }

        return Math.abs(sumMaxK - sumMinK);

        
        
    }
}