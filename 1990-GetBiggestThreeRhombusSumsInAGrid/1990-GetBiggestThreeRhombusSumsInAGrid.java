// Last updated: 6/7/2026, 6:30:27 PM
class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        TreeSet<Integer> sums = new TreeSet<>();

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){

                sums.add(grid[i][j]);

                for(int k = 1; ; k++){

                    //for chacking inside/outside gridfd boundary    
                    if(i+2*k >= m || j+k >= n || j-k < 0){
                        break;
                    }

                    int sum = 0;
                    int x = i, y = j;

                    // top -> right
                    for(int t = 0; t < k; t++) {
                        sum += grid[x + t][y + t];
                    }

                    // right -> bottom
                    for(int t = 0; t < k; t++) {
                        sum += grid[x + k + t][y + k - t];
                    }

                    // bottom -> left
                    for(int t = 0; t < k; t++) {
                        sum += grid[x + 2*k - t][y - t];
                    }

                    // left -> top
                    for(int t = 0; t < k; t++) {
                        sum += grid[x + k - t][y - k + t];
                    }

                    sums.add(sum);
                }
            }
        }

        int size = Math.min(3, sums.size());
        int[] ans = new int[size];

        int idx = 0;
        for(int val: sums.descendingSet()){
            ans[idx++] = val;
            if(idx == size)
                break;
        }

        
        return ans;
    }
}