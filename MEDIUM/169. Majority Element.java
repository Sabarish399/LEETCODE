// Problem: 169. Majority Element
// Link: https://leetcode.com/problems/majority-element/
// Approach:
//   Boyer–Moore Voting Algorithm.
//   Maintain a candidate and a frequency counter. 
//   When freq becomes zero, choose a new candidate.
//   Since a majority element (> n/2 occurrences) is guaranteed to exist,
//   the final candidate is the correct answer.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int res = 0, freq = 0;
        for(int num:nums)
        {
            if(freq == 0) res = num;

            freq += num == res ? 1 : -1; 
        }
        return res;
    }
}
