// Last updated: 6/7/2026, 6:30:49 PM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        int start = 1;
        int end = k;
        int n = s.length();
        Set<String> codes = new HashSet();

        while(end<=n){
            codes.add(s.substring(start-1, end));
            start += 1;
            end += 1;
        }

        if(codes.size() == Math.pow(2, k))
            return true;
        else
            return false;
    }
}