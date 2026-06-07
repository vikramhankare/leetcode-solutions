// Last updated: 6/7/2026, 6:29:52 PM
class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        int n = word.length();

        for(int i = 0; i<n; i++){
            set.add(word.charAt(i));
        }

        Map<Character, Integer> map = new HashMap<>();
        for(Character c: set){
            if(c>= 'a' && c<= 'z'){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
            else{
                char lowerC = Character.toLowerCase(c);
                map.put(lowerC, map.getOrDefault(lowerC, 0)-1);
            }
        }

        int count = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == 0)
                count++;
        }

        return count;
    }
}