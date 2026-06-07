// Last updated: 6/7/2026, 6:30:21 PM
class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int l = n*m;
        if(l == 1)
            return 0;
        int[] arr = new int[l];

        int k = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[k++] = grid[i][j];
            }
        }

        int commonRemainder = arr[0] % x;
        int i = 1;
        while(i<l){
            if(arr[i]%x != commonRemainder)
                return -1;
            else 
                i++;
        }

        Arrays.sort(arr);
        int middleElement = arr[l/2];

        int sum = 0;
        i = 0;
        while(i<l){
            sum = sum + (Math.abs(arr[i] - middleElement));
            i++;
        }

        return sum/x;
    }
}