// Problem: 349. Intersection of Two Arrays
// Link: https://leetcode.com/problems/intersection-of-two-arrays/
//
// Approach:
// - Use a HashSet to store elements of nums1.
// - Traverse nums2:
//     • If element exists in set1 → add to result set (to ensure uniqueness).
// - Convert result set to array and return.
//
// Time Complexity: O(n + m)
// Space Complexity: O(n)

class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i : nums1)
        {
            set1.add(i);
        }
        for(int i : nums2)
        {
            if(set1.contains(i))
                set2.add(i);
        }

        int[] ans = new int[set2.size()];
        int i = 0;
        for(int j : set2)
        {
            ans[i++] = j;
        }
        return ans;

    }
}
