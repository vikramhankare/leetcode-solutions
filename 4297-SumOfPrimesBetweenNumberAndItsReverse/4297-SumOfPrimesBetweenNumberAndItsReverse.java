// Last updated: 6/7/2026, 6:28:42 PM
class Solution {
    public int sumOfPrimesInRange(int n) {
        int r = 0;
        int temp = n;

        while(temp>0){
            int rem = temp%10;
            r = r*10 + rem;
            temp = temp/10;
        }

        int max = Math.max(r, n);
        int min = Math.min(r, n);

        boolean[] ans  = new boolean[max+1];
        Arrays.fill(ans, true);

        ans[0] = false;
        ans[1] = false;

        for(int i = 2; i*i<=max; i++){
            if(ans[i] == true){
                for(int j = i*i; j<=max; j = j+i){
                    ans[j] = false;
                }
            }
        }

        int sum = 0;
        for(int i = min; i<=max; i++){
            if(ans[i] == true)
                sum += i;
        }
        return sum; 
    }
}