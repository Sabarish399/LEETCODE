// Problem: 128. Longest Consecutive Sequence
// Link: https://leetcode.com/problems/longest-consecutive-sequence/
// Approach:
//   Insert all numbers into a HashSet for O(1) lookups.
//   For each number, only start counting if (num - 1) is not in the set,
//   meaning this number is the beginning of a consecutive sequence.
//   Then expand forward until the sequence ends.
// Time Complexity: O(n) on average
// Space Complexity: O(n)

class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;

        for(int i:nums)
            set.add(i);

        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                int currLength = 1;
                while(set.contains(i+currLength))
                    currLength++;
                maxLength = Math.max(currLength,maxLength);
            }
        }
        return maxLength;
    }
}
