// Last updated: 6/7/2026, 6:28:35 PM
class Solution {
    public boolean consecutiveSetBits(int n) {
        if(Integer.bitCount(n& (n>>1)) != 1)
            return false;
        else
            return true;
    }
}