// Last updated: 6/7/2026, 6:30:32 PM
class Solution {
    public boolean checkOnesSegment(String s) {
        int i = 0;
        int n = s.length();

        while(i<n && s.charAt(i) == '0'){
            i++;
        }

        while(i<n && s.charAt(i) == '1'){
            i++;
        }

        if(i == n)
            return true;

        while(i<n && s.charAt(i) == '0'){
            i++;
        }

        if(i == n)
            return true;

        return false;
    }
}