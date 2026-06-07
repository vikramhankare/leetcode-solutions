// Last updated: 6/7/2026, 6:30:04 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = A.length;

        for(int i =0; i<n; i++){
            map.put(A[i], 2);
        }

        int count = n;
        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            map.put(A[i], map.get(A[i])-1);
            if(map.get(A[i]) == 0)
                count--;
            
            map.put(B[i], map.get(B[i])-1);
            if(map.get(B[i]) == 0)
                count--;

            ans[i] = n-count;
            // System.out.println(ans[i]);
        }

        return ans;

    }
}