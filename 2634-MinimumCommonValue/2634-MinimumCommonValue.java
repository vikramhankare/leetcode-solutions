// Last updated: 6/7/2026, 6:30:09 PM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int itr1 = 0;
        int itr2 = 0;

        while(itr1<n1 && itr2<n2){
            if(nums1[itr1] == nums2[itr2]){
                return nums1[itr1];
            }
            else if(nums1[itr1] > nums2[itr2]){
                itr2++;
            }
            else if(nums1[itr1] < nums2[itr2]){
                itr1++;
            }
        }

        return -1;
    }
}