// Last updated: 6/7/2026, 6:29:09 PM
class Solution {
    public int manhattan(int x1, int y1, int x2, int y2){
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
    
    public int[] bestTower(int[][] tower, int[] center, int radius) {
        
        int n = tower.length;
        int maxQuality = -1;
        int[] maxQualityTower = new int[2];
        maxQualityTower[0] = -1;
        maxQualityTower[1] = -1;
        
        for(int i=0; i<n; i++){
            if(manhattan(center[0], center[1], tower[i][0], tower[i][1])<=radius){
                if(tower[i][2] > maxQuality){
                    maxQuality = tower[i][2];
                    maxQualityTower[0] = tower[i][0];
                    maxQualityTower[1] = tower[i][1];
                }
                if(tower[i][2] == maxQuality){
                    if(tower[i][0] < maxQualityTower[0] ||  (tower[i][0] == maxQualityTower[0] && tower[i][1] < maxQualityTower[1]))
                    {
                        maxQualityTower[0] = tower[i][0];
                        maxQualityTower[1] = tower[i][1];
                    }
                    
                }
            }
        }

        return maxQualityTower;
        
    }
}