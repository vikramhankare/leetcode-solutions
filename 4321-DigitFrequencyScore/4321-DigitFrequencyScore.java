// Last updated: 6/7/2026, 6:28:30 PM
class Solution {
    public int digitFrequencyScore(int n) {
         int[] freq = new int[10];
        Arrays.fill(freq, 0);
        int temp = n;
        
        while(temp > 0){
            int rem = temp%10;
            freq[rem]++;
            temp = temp/10;
        }

        int ans = 0;
        for(int i = 0; i<10; i++){
            ans = ans + (i*freq[i]);
        }

        return ans;
    }
}