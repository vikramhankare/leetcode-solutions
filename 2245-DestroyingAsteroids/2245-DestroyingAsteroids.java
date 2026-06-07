// Last updated: 6/7/2026, 6:30:16 PM
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;

        int n = asteroids.length;
        for(int i = 0; i<n; i++){
            if(currMass >= asteroids[i]){
                currMass += asteroids[i];
            }
            else{
                return false;
            }
        }

        return true;
    }
}