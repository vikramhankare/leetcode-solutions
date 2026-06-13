// Last updated: 6/13/2026, 9:55:45 AM
// simple simulation as mentioned in question
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        int n = words.length;
4        String ans = "";
5
6        for(int i = 0; i<n; i++){
7            String word = words[i];
8            int len = word.length();
9            int total = 0;
10            for(int j = 0; j<len; j++){
11                total += weights[word.charAt(j) - 'a'];
12            }
13
14            ans +=  (char)('z' - (total % 26));
15        }
16
17        return ans;
18    }
19}