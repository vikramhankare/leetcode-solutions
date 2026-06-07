// Last updated: 6/7/2026, 6:28:50 PM
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int count = 0;

        for(int i =0; i<n; i++){
            int num = nums[i];

            while(num > 0){
                int rem = num%10;
                if(rem == digit)
                    count++;
                num = num/10;
            }
        }

        return count;
    }
}