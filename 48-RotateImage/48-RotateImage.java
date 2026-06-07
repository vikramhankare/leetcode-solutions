// Last updated: 6/7/2026, 6:31:29 PM
class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int colLeft = 0;
        int colRight = n-1;

        while(colLeft < colRight){
            int i = 0;
            while(i<n){
                int temp = matrix[i][colLeft];
                matrix[i][colLeft] = matrix[i][colRight];
                matrix[i][colRight] = temp;
                i++;
            }
            colLeft++;
            colRight--;
        }
    }
}