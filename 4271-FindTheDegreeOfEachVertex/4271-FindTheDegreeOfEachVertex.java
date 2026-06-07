// Last updated: 6/7/2026, 6:28:55 PM
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        
        int[] ans = new int[rows];
        
        for(int i = 0; i<rows; i++){
            int connection = 0;
            for(int j = 0; j<cols; j++){
                connection += matrix[i][j];
            }
            ans[i] = connection;
        }

        return ans;
    }
}