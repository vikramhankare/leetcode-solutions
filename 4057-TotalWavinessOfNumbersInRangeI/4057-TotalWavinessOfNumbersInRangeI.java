// Last updated: 6/7/2026, 6:29:28 PM
class Solution {

    private int waviness(int x) {
        String s = Integer.toString(x);

        int cnt = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            char cur = s.charAt(i);

            if ((cur > s.charAt(i - 1) && cur > s.charAt(i + 1)) ||
                (cur < s.charAt(i - 1) && cur < s.charAt(i + 1))) { //checking Peak or Valley
                cnt++;
            }
        }

        return cnt;
    }

    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int x = num1; x <= num2; x++) {
            ans += waviness(x);
        }

        return ans;
    }
}