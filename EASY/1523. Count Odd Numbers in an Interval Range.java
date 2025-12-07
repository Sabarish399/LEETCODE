// Problem: 1523. Count Odd Numbers in an Interval Range
// Link: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
// Approach:
//   Use the direct math formula for counting odd numbers in a range:
//       count = (high + 1) / 2 - (low / 2)
//   This computes how many odd numbers exist up to 'high' and subtracts how many exist before 'low'.
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public int countOdds(int low, int high) 
    {
        return (high + 1) / 2 - (low / 2);
    }
}
