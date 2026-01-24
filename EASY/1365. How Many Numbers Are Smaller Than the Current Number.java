// Problem: 1365. How Many Numbers Are Smaller Than the Current Number
// Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// Approach:
//   Use counting sort / prefix frequency array since numbers are in range [0, 100].
//   1) Count the frequency of each number.
//   2) Build a prefix sum array where freq[i] stores how many numbers ≤ i.
//   3) For each nums[i], the count of smaller numbers is freq[nums[i] - 1] (or 0 if nums[i] == 0).
// Time Complexity: O(n + k) where k = 101 (constant)
// Space Complexity: O(k)

class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {   
        int n = nums.length;
        int[] freq = new int[101];

        for(int num:nums) freq[num]++;

        for(int i=1;i<freq.length;i++)
            freq[i] += freq[i-1];

        int[] res = new int[n];
        for(int i=0;i<n;i++)
            res[i] = nums[i] == 0 ? 0 : freq[nums[i]-1];

        return res;
    }
}
