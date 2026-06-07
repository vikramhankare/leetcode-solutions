// Last updated: 6/7/2026, 6:29:25 PM
class Solution {
    public int maxDistinct(String s) {
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
        char[] arr = s.toCharArray();
        for(int i = 0; i<n; i++){
            set.add(arr[i]);
        }

        return set.size();
    }
}