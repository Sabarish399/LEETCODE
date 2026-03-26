// Problem: 1512. Number of Good Pairs
// Link: https://leetcode.com/problems/number-of-good-pairs/
//
// Approach:
// - Use a frequency array to count occurrences.
// - Traverse the array:
//     • For each number, add current frequency to count.
//       (this counts how many identical elements appeared before)
//     • Then increment its frequency.
// - Return total count.
//
// Time Complexity: O(n)
// Space Complexity: O(1) — fixed size array (range ≤ 100)

class Solution 
{
    public int numIdenticalPairs(int[] nums) 
    {
        int freq[] = new int[101];

        int count = 0;
        for(int i:nums)
            count += freq[i]++;
        
        return count;
    }
}
