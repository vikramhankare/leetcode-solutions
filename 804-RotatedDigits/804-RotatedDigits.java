// Last updated: 6/7/2026, 6:31:02 PM
class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            
            boolean hasValidDiff = false; // contains 2,5,6,9
            boolean isInvalid = false;    // contains 3,4,7
            
            for (char c : s.toCharArray()) {
                if (c == '3' || c == '4' || c == '7') {
                    isInvalid = true;
                    break;
                }
                if (c == '2' || c == '5' || c == '6' || c == '9') {
                    hasValidDiff = true;
                }
            }
            
            if (!isInvalid && hasValidDiff) {
                count++;
            }
        }
        
        return count;
    }
}