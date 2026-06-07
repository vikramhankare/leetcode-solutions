// Last updated: 6/7/2026, 6:30:22 PM
class Solution {
public:
    string findDifferentBinaryString(vector<string>& nums) {
        string ans = "";
        for(int i = 0; i < nums.size(); i++) {
            // Toggle the bit at index i to ensure uniqueness
            ans += (nums[i][i] == '0') ? '1' : '0';
        }
        return ans;
    }
};