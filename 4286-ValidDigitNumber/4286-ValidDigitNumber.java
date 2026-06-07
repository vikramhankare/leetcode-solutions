// Last updated: 6/7/2026, 6:28:48 PM
class Solution {
    public boolean validDigit(int n, int x) {
        boolean inBetweenValid = false;
        boolean startValid = true;

        while(n>=10){
            int lastDigit = n%10;
            if(lastDigit == x){
                inBetweenValid = true;
            }
            n = n/10;
        }

        if(n == x)
             startValid = false;

        if(startValid == true && inBetweenValid == true)
            return true;
        else 
            return false;
    }
}