// Last updated: 6/7/2026, 6:28:52 PM
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int max = 200000;

        boolean[] isPrime = sieve(max);

        int[] nextPrime = new int[max + 2];
        int next = -1;
        for(int i = max; i>=0; i--){
            if(isPrime[i] == true)
                next = i;
            nextPrime[i] = next;
        }


        int[] nextNonPrime = new int[max + 2];
        next = -1;
        for(int i = max; i>=0; i--){
            if(isPrime[i] == false)
                next = i;
            nextNonPrime[i] = next;
        }

        int count = 0;


        for(int i = 0; i<n; i++){
            if(i%2 == 0){
                int target = nextPrime[nums[i]];
                count += (target-nums[i]);
            }
            else{
                int target = nextNonPrime[nums[i]];
                count += (target-nums[i]);
            }
        }

        

        return count;
    }

    public boolean[] sieve(int n){
        boolean[] isPrime = new boolean[n+1];

        for(int i = 2; i<=n; i++){
            isPrime[i]= true;
        }

        for(int i = 2; i*i<=n; i++){
            if(isPrime[i] == true){
                for(int j = i*i; j<=n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}