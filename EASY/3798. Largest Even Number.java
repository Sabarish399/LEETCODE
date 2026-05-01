// Problem: 3798. Largest Even Number
// Link: https://leetcode.com/problems/largest-even-number/
//
// Approach:
// - Since the string contains only '1' and '2':
//     • The only even digit is '2'.
// - To form the largest even number:
//     • The last digit must be '2'.
//     • Keep the longest prefix ending at the last occurrence of '2'.
// - If no '2' exists → return empty string.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public String largestEven(String s) 
    {
        int i = s.lastIndexOf('2');

        return i==-1 ? "" : s.substring(0,i+1);
    }
}
