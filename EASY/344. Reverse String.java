// Problem: 344. Reverse String
// Link: https://leetcode.com/problems/reverse-string/
// Approach:
//   Use two pointers starting from both ends of the array.
//   Swap characters while moving the pointers toward the center.
//   Perform the reversal in-place.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public void reverseString(char[] s) 
    {
        int left = 0,right = s.length-1;

        while(left<right)
        {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            right--;
            left++;
        }
    }
}
