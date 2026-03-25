  // Problem: 2206. Divide Array Into Equal Pairs
// Link: https://leetcode.com/problems/divide-array-into-equal-pairs/
//
// Approach:
// - Count frequency of each number using an array.
// - For each number:
//     • If its frequency is odd → cannot form pairs → return false.
// - If all frequencies are even → return true.
//
// Time Complexity: O(n)
// Space Complexity: O(1) — fixed size array (range ≤ 500)

class Solution 
{
    public boolean divideArray(int[] nums) 
    {
        int n = nums.length / 2;
        int freq[] = new int[501];
        for(int i=0;i<2*n;i++)
        {
            freq[nums[i]]++;
        }

        for(int i=0;i<2*n;i++)
        {
            if((freq[nums[i]]&1)!=0) return false;
        }
        return true;
    }
}
