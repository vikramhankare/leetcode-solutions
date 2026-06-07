// Last updated: 6/7/2026, 6:28:57 PM
class Solution {
    public double[] internalAngles(int[] sides) {
        int x = sides[0];
        int y = sides[1];
        int z = sides[2];
        boolean validTriangle = false;
        
        if(x+y>z && y+z>x && x+z>y)
            validTriangle = true;

        double[] angles = new double[3];
        
        if(validTriangle){
            angles[0] = Math.toDegrees(Math.acos((y*y + z*z - x*x)/(2.0*y*z)));
            angles[1] = Math.toDegrees(Math.acos((x*x + z*z - y*y)/(2.0*x*z)));
            angles[2] = 180.0 - (angles[0]+angles[1]);
        }
        else
            return new double[]{};
        Arrays.sort(angles);
        return angles; 
    }
}