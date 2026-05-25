// Problem: 2956. Find Common Elements Between Two Arrays
// Link: https://leetcode.com/problems/find-common-elements-between-two-arrays/
//
// Approach:
// - For ans[0]:
//     • Count elements in nums1 that appear at least once in nums2.
// - For ans[1]:
//     • Count elements in nums2 that appear at least once in nums1.
// - Use nested loops:
//     • For each element, search in the other array.
//     • Break after first match to avoid duplicate counting.
//
// Time Complexity: O(n * m)
// Space Complexity: O(1)

class Solution 
{
    public int[] findIntersectionValues(int[] nums1, int[] nums2) 
    {
        int[] ans = new int[2];

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i] == nums2[j]) 
                {
                    ans[0]++;
                    break;
                }
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums1[j] == nums2[i])
                {
                    ans[1]++;
                    break;
                }
            }
        }
        return ans;
    }
}
