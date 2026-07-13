// Problem: 2780. Minimum Index of a Valid Split
// Link: https://leetcode.com/problems/minimum-index-of-a-valid-split/
//
// Approach:
// - Use the Boyer-Moore Voting Algorithm to find the majority element candidate.
// - Count the total occurrences of the majority element in the entire array.
// - Traverse the array while maintaining the majority element's frequency in
//   the left and right partitions.
// - At each index, check whether the majority element is dominant in both
//   partitions.
// - Return the first index satisfying the condition; otherwise, return -1.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int minimumIndex(List<Integer> nums) 
    {
        int count = 0, majority = 0;
        for(int num : nums)
        {
            if(count == 0) majority = num;
            count += (num == majority) ? 1 : -1;
        }

        int rCount = 0, lCount =0;
        for(int num : nums)
        {
            if(num == majority) rCount++;
        }

        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i) == majority)
            {
                rCount--;
                lCount++;
            }

            int lLen = i+1;
            int rLen = nums.size() - i - 1;

            if(2 * rCount > rLen && 2 * lCount > lLen) return i;
        }
        return -1;
    }
}
