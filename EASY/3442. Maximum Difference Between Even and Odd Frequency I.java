// Problem: 3442. Maximum Difference Between Even and Odd Frequency I
// Link: https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/
//
// Approach:
// - Count frequency of each character using an array of size 26.
// - Traverse the frequency array:
//     • Ignore characters with frequency 0.
//     • Track the maximum odd frequency (maxOdd).
//     • Track the minimum even frequency (minEven).
// - The required answer is maxOdd - minEven.
//
// Time Complexity: O(n)
//     - n = length of string
// Space Complexity: O(1)
//     - Fixed size array of 26

class Solution 
{
    public int maxDifference(String s) 
    {
        int[] freq = new int[26];
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(char c:s.toCharArray()) freq[c-'a']++;
        for(int val:freq)
        {
            if(val == 0) continue;
            if((val&1)==1 && val > maxOdd) maxOdd = val;
            else if((val&1)==0 && val < minEven) minEven = val;
        }
        return maxOdd - minEven;
    }
}
