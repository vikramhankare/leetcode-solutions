// Last updated: 6/7/2026, 6:29:26 PM
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long sum = 0;

        for(int k = 0; k<n; k++){
            nums[k] = nums[k]*nums[k];
        }

        Arrays.sort(nums);
        List<Long> ans = new ArrayList<>();
        int i = 0, j =n-1;
        while(i<j){
            ans.add((long)nums[j]);
            ans.add((long)nums[i]);
            j--;
            i++;
        }
        if(n%2 == 1)
            ans.add((long)nums[n/2]);

        for(int k = 0; k<n; k++){
            if(k%2==0)
                sum += ans.get(k);
            else
                sum -= ans.get(k);
        }

        return sum;
    }
}