// Last updated: 6/7/2026, 6:29:11 PM
class Solution {
    public int mirrorDistance(int n) {
        int x = n;
        int reverse = 0;
        while(x>0){
            reverse = (reverse*10) + x%10;
            x = x/10;
        }
        System.out.println(reverse);
        return Math.abs(n-reverse);
    }
}