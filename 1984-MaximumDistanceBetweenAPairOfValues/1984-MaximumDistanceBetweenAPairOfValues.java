// Last updated: 6/7/2026, 6:30:28 PM
class Solution {
    public int maxDistance(int[] A, int[] B) {
        int i, j;

        for (i = 0, j = 0; i < A.length && j < B.length; j++)
            if (A[i] > B[j])
                i++;

        return Math.max(0, j - i - 1);
    }
}