// Last updated: 6/7/2026, 6:29:53 PM
class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> ignoreSet = new HashSet<>();
        Map<Character, Integer> freq = new HashMap<>();
        int n = word.length();

        for(int i = 0; i<n; i++){
            freq.put(word.charAt(i), freq.getOrDefault(word.charAt(i), 0)+1);
        }

        for(int i = 0; i<n; i++){
            char c = word.charAt(i); 
            if(c>='a' && c<='z'){
                if(ignoreSet.contains(c) == true){
                    continue;
                }
                else{
                    freq.put(c, freq.get(c)-1);
                }
            }
            else{
                char lowerC = Character.toLowerCase(c);
                if(freq.get(lowerC) == null){
                    freq.remove(c);
                    ignoreSet.add(c);
                    ignoreSet.add(lowerC);
                }
                else if(freq.get(lowerC) == 0){
                    freq.put(c, freq.get(c)-1);
                }
                else{
                    ignoreSet.add(c);
                    ignoreSet.add(lowerC);
                    freq.remove(c);
                    freq.remove(lowerC);
                }
            }
        }

        int count = 0;
        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            char c = entry.getKey();
            int characterFreq = entry.getValue();
            char upperC = Character.toUpperCase(c);
            if(c >= 'a' && c<='z' && characterFreq==0 && freq.get(upperC)!=null)
                count++;
            else
                continue;
        }   

        return count;
    }
}