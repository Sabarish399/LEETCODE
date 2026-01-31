// Problem: 744. Find Smallest Letter Greater Than Target
// Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Approach:
//   Since the letters array is sorted, scan from left to right
//   and return the first character strictly greater than target.
//   If no such character exists, the array wraps around,
//   so return the first element.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public char nextGreatestLetter(char[] letters, char target) 
    {
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target)
                return letters[i];
        }
        return letters[0];
    }
}
