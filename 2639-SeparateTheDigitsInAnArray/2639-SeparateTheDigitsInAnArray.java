// Last updated: 6/7/2026, 6:30:08 PM
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n =nums.length;

        for(int i = 0; i<n; i++){
            String num = String.valueOf(nums[i]);
            int size = num.length();
            for(int j = 0; j<size; j++){
                ans.add(num.charAt(j) - '0');
            }
        }

        int[] res = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            res[i] = ans.get(i);
        }

        return res;
    }
}