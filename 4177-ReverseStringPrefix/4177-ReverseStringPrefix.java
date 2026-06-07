// Last updated: 6/7/2026, 6:29:10 PM
class Solution {
    public String reversePrefix(String s, int k) {
        char[] charArray = s.toCharArray();

        int i = 0;
        while(i<k){
            char temp = charArray[i];
            charArray[i] = charArray[k-1];
            charArray[k-1] = temp;
            i++;
            k--;
        }

        return new String(charArray);
        
    }
}