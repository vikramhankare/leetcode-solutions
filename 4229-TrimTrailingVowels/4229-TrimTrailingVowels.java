// Last updated: 6/7/2026, 6:29:05 PM
class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        int i = n-1;
        
        while(i>=0){
            if(notVowel(s.charAt(i)) == true)
                break;
            i--;
        }
        if(i<0)
            return "";
        else
            return s.substring(0, i+1);
    }

    public boolean notVowel(char c){
        if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
            return true;
            
        }
        else return false;
    }
}