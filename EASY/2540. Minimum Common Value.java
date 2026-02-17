// Problem: 2540. Minimum Common Value
// Link: https://leetcode.com/problems/minimum-common-value/
//
// Approach (Two Pointers):
// - Since both arrays are sorted in non-decreasing order,
//   use two pointers p1 and p2 starting at index 0.
// - While both pointers are within bounds:
//     • If nums1[p1] == nums2[p2], return that value.
//     • If nums1[p1] > nums2[p2], increment p2.
//     • Otherwise, increment p1.
// - If no common element is found, return -1.
//
// Time Complexity: O(n + m)
//     - n = nums1.length
//     - m = nums2.length
// Space Complexity: O(1) — no extra space used.

class Solution 
{
    public int getCommon(int[] nums1, int[] nums2) 
    {
        int p1 = 0;
        int p2 = 0;

        while(p1 < nums1.length && p2 < nums2.length)
        {
            if(nums1[p1]==nums2[p2]) return nums1[p1];
            else if(nums1[p1] > nums2[p2]) p2++;
            else p1++;
        }
        return -1;
    }
}
