// Last updated: 6/10/2026, 9:36:46 AM
// Use of Proirity Queue for k subarrays with max value and sparse table
1class Solution {
2    private int[][] stMax;
3    private int[][] stMin;
4    private int[] lg;
5
6    private long getValue(int l, int r) {
7
8        int len = r - l + 1;
9        int p = lg[len];
10
11        int mx = Math.max(
12            stMax[p][l],
13            stMax[p][r - (1 << p) + 1]
14        );
15
16        int mn = Math.min(
17            stMin[p][l],
18            stMin[p][r - (1 << p) + 1]
19        );
20
21        return (long) mx - mn;
22    }
23
24    public long maxTotalValue(int[] nums, int k) {
25        int n = nums.length;
26
27        // Precompute logs
28        lg = new int[n + 1];
29        for (int i = 2; i <= n; i++) {
30            lg[i] = lg[i / 2] + 1;
31        }
32
33        int LOG = lg[n] + 1;
34
35        stMax = new int[LOG][n];
36        stMin = new int[LOG][n];
37
38        // Level 0
39        for (int i = 0; i < n; i++) {
40            stMax[0][i] = nums[i];
41            stMin[0][i] = nums[i];
42        }
43
44        // Build Sparse Tables
45        for (int j = 1; j < LOG; j++) {
46            for (int i = 0; i + (1 << j) <= n; i++) {
47
48                stMax[j][i] = Math.max(
49                    stMax[j - 1][i],
50                    stMax[j - 1][i + (1 << (j - 1))]
51                );
52
53                stMin[j][i] = Math.min(
54                    stMin[j - 1][i],
55                    stMin[j - 1][i + (1 << (j - 1))]
56                );
57            }
58        }
59
60        PriorityQueue<long[]> pq = new PriorityQueue<>(
61            (a, b) -> Long.compare(b[0], a[0])
62        );
63
64        // Initial candidates
65        for (int l = 0; l < n; l++) {
66            pq.offer(new long[]{getValue(l, n - 1), l, n - 1});
67        }
68
69        long ans = 0;
70
71        while (k-- > 0) {
72
73            long[] cur = pq.poll();
74
75            long val = cur[0];
76            int l = (int) cur[1];
77            int r = (int) cur[2];
78
79            ans += val;
80
81            if (r > l) {
82                pq.offer(new long[]{getValue(l, r - 1),l,r - 1});
83            }
84        }
85
86        return ans;
87    }
88}