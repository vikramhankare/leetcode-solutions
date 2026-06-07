// Last updated: 6/7/2026, 6:30:44 PM
class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int count = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == 1){
                    int row = 0;
                    int col = 0;

                    boolean special = true;

                    while(row>=0 && row<n){
                        if(mat[row][j] == 1 && row != i){
                            special = false;
                            break;
                        }
                        row++;
                    }

                    while(col>=0 && col<m){
                        if(mat[i][col] == 1 && col != j){
                            special = false;
                            break;
                        }
                        col++;
                    }

                    if(special == true)
                        count++;
                }
            }
        }

        return count;
    }
}