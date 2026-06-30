// Problem: 2341. Maximum Number of Pairs in Array
// Link: https://leetcode.com/problems/maximum-number-of-pairs-in-array/
//
// Approach:
// - Count the frequency of each number using a frequency array.
// - For each distinct number, compute the number of pairs as freq / 2.
// - Sum the pairs formed by all numbers.
// - The remaining elements are the total array size minus twice the number
//   of pairs.
// - Return the number of pairs and leftover elements.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int[] numberOfPairs(int[] nums) 
    {

        int[] freq = new int[101];
        for(int num : nums) 
            freq[num]++;

        int pairs = 0;

        for(int i=0;i<freq.length;i++)
        {
            pairs += freq[i]/2;
        }

        int left = nums.length - pairs*2;
        
        return new int[]{pairs,left};
    }
}
