// Last updated: 6/7/2026, 6:30:55 PM
//1. Recursion + Memoization
class Solution {
    int[][][] dp;

    int dist(int a, int b){
        if(a == 26 || b == 26) return 0;

        int r1 = a / 6, c1 = a % 6;
        int r2 = b / 6, c2 = b % 6;

        return Math.abs(r1-r2) + Math.abs(c1-c2);
    }

    int solve(int i, int f1, int f2, String word){
        if(i == word.length()) return 0;

        if(dp[i][f1][f2] != -1)
            return dp[i][f1][f2];

        int cur = word.charAt(i) - 'A';

        int move1 = dist(f1, cur) +
                    solve(i+1, cur, f2, word);

        int move2 = dist(f2, cur) +
                    solve(i+1, f1, cur, word);

        return dp[i][f1][f2] = Math.min(move1, move2);
    }

    public int minimumDistance(String word) {
        dp = new int[301][27][27];

        for(int i=0;i<301;i++)
            for(int j=0;j<27;j++)
                Arrays.fill(dp[i][j], -1);

        return solve(0, 26, 26, word);
    }
}

//2. 3d DP

// class Solution {
//     int dist(int a, int b){
//         if(a==26 || b==26) return 0;
//         return Math.abs(a/6-b/6) + Math.abs(a%6-b%6);
//     }

//     public int minimumDistance(String word) {
//         int n = word.length();
//         int INF = (int)1e9;

//         int[][][] dp = new int[n+1][27][27];

//         for(int i=0;i<=n;i++)
//             for(int j=0;j<27;j++)
//                 Arrays.fill(dp[i][j], INF);

//         dp[0][26][26] = 0;

//         for(int i=0;i<n;i++){
//             int cur = word.charAt(i)-'A';

//             for(int f1=0;f1<=26;f1++){
//                 for(int f2=0;f2<=26;f2++){
//                     int val = dp[i][f1][f2];
//                     if(val==INF) continue;

//                     dp[i+1][cur][f2] =
//                         Math.min(dp[i+1][cur][f2],
//                                  val + dist(f1,cur));

//                     dp[i+1][f1][cur] =
//                         Math.min(dp[i+1][f1][cur],
//                                  val + dist(f2,cur));
//                 }
//             }
//         }

//         int ans = INF;
//         for(int i=0;i<=26;i++)
//             for(int j=0;j<=26;j++)
//                 ans = Math.min(ans, dp[n][i][j]);

//         return ans;
//     }
// }

// 3. 1D Dp

// class Solution {
//     int dist(int a, int b){
//         if(a==26 || b==26) return 0;
//         return Math.abs(a/6-b/6) + Math.abs(a%6-b%6);
//     }

//     public int minimumDistance(String word) {
//         int n = word.length();
//         int INF = (int)1e9;

//         int[] dp = new int[27];
//         Arrays.fill(dp, INF);
//         dp[26] = 0;

//         for(int i=1;i<n;i++){
//             int[] next = new int[27];
//             Arrays.fill(next, INF);

//             int prev = word.charAt(i-1)-'A';
//             int cur  = word.charAt(i)-'A';

//             for(int j=0;j<=26;j++){
//                 if(dp[j]==INF) continue;

//                 next[j] = Math.min(
//                     next[j],
//                     dp[j] + dist(prev,cur)
//                 );

//                 next[prev] = Math.min(
//                     next[prev],
//                     dp[j] + dist(j,cur)
//                 );
//             }

//             dp = next;
//         }

//         int ans = INF;
//         for(int x: dp)
//             ans = Math.min(ans, x);

//         return ans;
//     }
// }