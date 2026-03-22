// Problem: 1394. Find Lucky Integer in an Array
// Link: https://leetcode.com/problems/find-lucky-integer-in-an-array/
//
// Approach:
// - Use a frequency array (range: 1 to 500).
// - Count occurrences of each number.
// - Traverse from 1 to 500:
//     • If freq[i] == i → it's a lucky number.
//     • Track the maximum such number.
// - Return max lucky number or -1 if none found.
//
// Time Complexity: O(n + k)
//     - n = size of array
//     - k = 500 (constant)
// Space Complexity: O(1)

class Solution 
{
    public int findLucky(int[] arr) 
    {
        int[] freq = new int[501];
        for(int i:arr) freq[i]++;

        int max = -1;
        for(int i=1;i<501;i++)
        {
            if(freq[i]==i) max = Math.max(i,max);
        }
        return max;
    }
}
