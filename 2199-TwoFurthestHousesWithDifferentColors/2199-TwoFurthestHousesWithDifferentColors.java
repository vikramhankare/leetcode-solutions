// Last updated: 6/7/2026, 6:30:18 PM
class Solution {
    public int maxDistance(int[] colors) {
        int i = 0;
        
        int max = Integer.MIN_VALUE;

        while(i<colors.length){
            int j = colors.length-1;
            while(j>=0){
                if(colors[i] != colors[j])
                    max = Math.max(max, Math.abs(i-j));
                j--;
            }
            i++;
        }
        

        return max;
    }
}