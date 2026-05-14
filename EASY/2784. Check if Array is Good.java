// Problem: 2784. Check if Array is Good
// Link: https://leetcode.com/problems/check-if-array-is-good/
//
// Approach:
// - A good array of length n must contain:
//     • Numbers from 1 to n-1 exactly once
//     • Number n-1 exactly twice
// - Let max = maximum element.
// - Conditions:
//     • max + 1 must equal array length
//     • frequency of 1..max-1 must be exactly 1
//     • frequency of max must be exactly 2
// - Use frequency counting to validate.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public boolean isGood(int[] nums) 
    {
        int n = nums.length;

        int max = 0;
        for(int i:nums)
        {
            max = Math.max(max,i);
        }

        if(max+1 != n) return false;

        int freq[] = new int[max+1];
        for(int i:nums)
        {
            if(i < 1 && i > max) return false;
            freq[i]++;
        }

        for(int i=1;i<max;i++)
        {
            if(freq[i] != 1) return false;
        }

        return freq[max]==2;
    }
}
