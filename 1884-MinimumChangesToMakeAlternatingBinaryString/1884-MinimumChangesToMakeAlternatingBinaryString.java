// Last updated: 6/7/2026, 6:30:33 PM
class Solution {
    public int minOperations(String s) {
        int n = s.length();

        int count1 = 0;
        char bit1 = '0';
        for(int i = 0; i<n; i++){
            if(bit1 != s.charAt(i))
                count1++;

            if(bit1 == '0')
                bit1 = '1';
            else 
                bit1 = '0';
        }


        int count2 = 0;
        char bit2 = '1';
        for(int i = 0; i<n; i++){
            if(bit2 != s.charAt(i))
                count2++;
                
            if(bit2 == '0')
                bit2 = '1';
            else 
                bit2 = '0';
        }

        return Math.min(count1, count2);
    }
}