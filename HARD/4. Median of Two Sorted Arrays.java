// Problem: 4. Median of Two Sorted Arrays
// Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
// Approach:
//   Use a merge-like process similar to merging two sorted arrays,
//   but stop once we reach the median position instead of fully merging.
//   Track the last two elements (m1, m2) seen during the merge.
//   If total length is odd, the median is m1.
//   If even, the median is the average of m1 and m2.
// Time Complexity: O(m + n)
// Space Complexity: O(1)

class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int i=0;
        int j=0;

        int m = nums1.length;
        int n = nums2.length;

        int m1 = 0;
        int m2 = 0;

        for(int cnt=0;cnt<=(n+m)/2;cnt++)
        {
            m2 = m1;
            if(i!=m && j!=n)
            {
                if(nums1[i]<nums2[j]) 
                    m1 = nums1[i++];
                else 
                    m1 = nums2[j++];
            }
            else if(i<m)
                m1 = nums1[i++];
            else
                m1 = nums2[j++];
        }

        if((m+n)%2 == 1) 
            return (double)m1;
        else 
            return ((double)m1+(double)m2)/2;
    }
}
