// Last updated: 6/7/2026, 6:31:00 PM
class Solution {
    public int binaryGap(int n) {
        int rem = 0;
        while(n>0){
            rem = n % 2;
            n = n/2;
            if(rem == 1)
                break;
        }

        if(n == 0)
            return 0;

        int dist = 0;
        int maxDist = 0;

        while(n>0){
            rem = n % 2;
            n = n/2;
            dist += 1;
            if(rem == 1){
                maxDist = Math.max(maxDist, dist);
                dist = 0;
            }
        }

        return maxDist;
        
    }
}