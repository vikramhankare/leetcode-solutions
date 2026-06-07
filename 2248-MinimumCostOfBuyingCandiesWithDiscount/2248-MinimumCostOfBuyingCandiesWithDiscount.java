// Last updated: 6/7/2026, 6:30:15 PM
class Solution {
    public int minimumCost(int[] cost) {
        Integer[] arr = Arrays.stream(cost)
                      .boxed()
                      .toArray(Integer[]::new);

        Arrays.sort(arr, Collections.reverseOrder());

        // for(int i = 0; i<n; i++){
        //     Sytem.out.println("cost")
        // }

        int n = arr.length;
        int ans = 0;

        for(int i = 0; i<n; i++){
            if((i+1)%3==0){
                continue;
            }
            else
                
                ans += arr[i];
        }

        return ans;    
    }
}