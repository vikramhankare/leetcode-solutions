// Last updated: 6/7/2026, 6:29:16 PM
class Solution {
    public int countElements(int[] nums, int k) {
    
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int n = nums.length;
        if(k==0)
            return n;
        
        for(int i = 0; i<n; i++){
            maxHeap.add(nums[i]);
        }

        int lastEle = 0;
        while(k-->0){
            lastEle = maxHeap.poll();
        }

        int count = 0;
        while(maxHeap.size()>0){
            if(maxHeap.peek()<lastEle){
                count++;
                maxHeap.poll();
            }
            else{
                maxHeap.poll();
            }
        }

        return count;
    }
}