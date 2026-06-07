// Last updated: 6/7/2026, 6:29:19 PM
class Solution {
    public int minFlips(String s) {
        int n = s.length();
        if(n<3)
            return 0;
        
        int countOne = 0;
        int countZero = 0;
        
        for(int i=0; i<n ;i++){
            if(s.charAt(i) == '1')
                countOne++;
            else
                countZero++;
        }

        if(countOne == 2 && s.charAt(0) == '1' && s.charAt(n-1) == '1')
            return 0;
        if(countOne == 2 && (s.charAt(0) == '0' || s.charAt(n-1) == '0'))
            return 1;
        if(countOne >= 2 && s.charAt(0) == '1' && s.charAt(n-1) == '1')
            return Math.min(countOne-2, countZero);
        if(countOne >= 2 && (((s.charAt(0) == '0' && s.charAt(n-1) == '1')) || ((s.charAt(0) == '1' && s.charAt(n-1) == '0'))) )
            return Math.min(countOne-1, countZero);
        if(countOne >= 2 && (s.charAt(0) == '0' && s.charAt(n-1) == '0') )
            return Math.min(countOne-1, countZero);

        return 0;
    }
}