// Last updated: 6/8/2026, 8:55:55 AM
// Partition the array by placing smaller elements on the left, larger elements on the right, and filling the remaining positions with the pivot.
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int n = nums.length;
4        int[] ans = new int[n];
5
6        int left = 0;
7        int right = n - 1;
8
9        int i = 0;
10        int j = n - 1;
11
12        while (i < n) {
13            if (nums[i] < pivot) {
14                ans[left++] = nums[i];
15            }
16
17            if (nums[j] > pivot) {
18                ans[right--] = nums[j];
19            }
20
21            i++;
22            j--;
23        }
24
25        // Remaining positions contain pivot
26        while (left <= right) {
27            ans[left++] = pivot;
28        }
29
30        return ans;
31    }
32}