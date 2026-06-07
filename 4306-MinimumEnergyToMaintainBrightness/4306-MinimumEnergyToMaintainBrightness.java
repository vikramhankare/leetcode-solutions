// Last updated: 6/7/2026, 6:28:36 PM
class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        long totalLength = 0;
        // int n = intervals.length;

        long start = intervals[0][0];
        long end = intervals[0][1];

        for(int i = 1; i<intervals.length; i++){
            long s = intervals[i][0];
            long e = intervals[i][1];

            if(s<=end){
                end = Math.max(end, e);
            }
            else{
                totalLength += end-start+1;
                start = s;
                end = e;
            }
        }

        totalLength += end-start+1;
        long bulbsRequired = (brightness + 2l)/3;
        return bulbsRequired*totalLength;
    }
}