// Last updated: 6/7/2026, 6:28:47 PM
class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans = new ArrayList<>();
        int total = 1<<n;

        for(int mask = 0; mask<total; mask++){
            String bin  = Integer.toBinaryString(mask);

            while(bin.length() < n){
                bin = "0" + bin;
            }

            if(noTwoCosecutiveOnes(bin) && costOfString(bin) <=k)
                ans.add(bin);
        }

        return ans;
        
    }

    public boolean noTwoCosecutiveOnes(String bin){
        for(int i = 1; i<bin.length(); i++){
            if(bin.charAt(i) == '1' && bin.charAt(i-1) == '1')
                return false;


        }

        return true;
    }

    public int costOfString(String bin){
        int n = bin.length();
        int cost = 0;
        for(int i = 0; i<n; i++){
            if(bin.charAt(i) == '1')
                cost += i;
        }

        return cost;
    }
}