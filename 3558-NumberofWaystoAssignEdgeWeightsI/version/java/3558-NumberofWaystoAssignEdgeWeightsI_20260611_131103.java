// Last updated: 6/11/2026, 1:11:03 PM
// BFS + Math
1class Solution {
2    static final int MOD = 1_000_000_007;
3
4    private long power(long a, long b) {
5        long ans = 1;
6
7        while (b > 0) {
8            if ((b & 1) == 1) {
9                ans = (ans * a) % MOD;
10            }
11
12            a = (a * a) % MOD;
13            b >>= 1;
14        }
15
16        return ans;
17    }
18
19    public int assignEdgeWeights(int[][] edges) {
20
21        int n = edges.length + 1;
22
23        List<List<Integer>> adj = new ArrayList<>();
24        for (int i = 0; i <= n; i++) {
25            adj.add(new ArrayList<>());
26        }
27
28        for (int[] edge : edges) {
29            int u = edge[0];
30            int v = edge[1];
31
32            adj.get(u).add(v);
33            adj.get(v).add(u);
34        }
35
36        Queue<int[]> q = new LinkedList<>();
37        boolean[] vis = new boolean[n + 1];
38
39        q.offer(new int[]{1, 0}); // {node, depth}
40        vis[1] = true;
41
42        int maxDepth = 0;
43
44        while (!q.isEmpty()) {
45            int[] cur = q.poll();
46
47            int node = cur[0];
48            int depth = cur[1];
49
50            maxDepth = Math.max(maxDepth, depth);
51
52            for (int neighbour : adj.get(node)) {
53                if (!vis[neighbour]) {
54                    vis[neighbour] = true;
55                    q.offer(new int[]{neighbour, depth + 1});
56                }
57            }
58        }
59
60        return (int) power(2, maxDepth - 1);
61    }
62}