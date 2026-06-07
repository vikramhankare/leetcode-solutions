// Last updated: 6/7/2026, 6:31:04 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int x = 0;
        int y = 0;

        for(int i =0; i<n; i++){
            if(moves.charAt(i) == 'R')
                x += 1;
            if(moves.charAt(i) == 'L')
                x -= 1;
            if(moves.charAt(i) == 'U')
                y -= 1;
            if(moves.charAt(i) == 'D')
                y += 1;    
        }

        if(x == 0 && y == 0)
            return true;
        else
            return false;    
    }
}