// Last updated: 6/7/2026, 6:28:34 PM
class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        int n = password.length();

        for(int i = 0; i<n; i++){
            set.add(password.charAt(i));
        }

        int ans = 0;
        for(Character c: set){
            if(c >= 'a' && c<= 'z')
                ans += 1;
            else if(c >= 'A' && c<= 'Z')
                ans += 2;
            else if(c >= '0' && c<= '9')
                ans += 3;
            else if(c == '!' || c == '@' || c == '#' || c == '$')
                ans += 5;
        }

        return ans;
    }
}