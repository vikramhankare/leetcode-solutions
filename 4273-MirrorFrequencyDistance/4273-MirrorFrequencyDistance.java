// Last updated: 6/7/2026, 6:28:54 PM
class Solution {
    public int mirrorFrequency(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i<n; i++){
            if(map.get(s.charAt(i)) == null)
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }

        int size = map.size();
        int ans = 0;

        for(Map.Entry<Character, Integer> ele : map.entrySet()){
            char ch = ele.getKey();
            int freqc = ele.getValue();
            char eleMirror;
            int freqm = 0;

            if(ch >= 97 && ch <=122)
                eleMirror =  (char)(219 - ch); 
            else
                eleMirror =  (char)(105 - ch); // to do numbers
            
            if(map.get(eleMirror) == null){
                freqm = 0;
                map.put(ch, 0);
            }
                
            else{
                freqm = map.get(eleMirror);
                map.put(eleMirror, 0);
                map.put(ch, 0);
            }
                

            ans += Math.abs(freqc - freqm);
        }

        return ans;
    }
}