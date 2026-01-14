// Problem: 258. Add Digits
// Link: https://leetcode.com/problems/add-digits/
// Approach:
//   Use the digital root formula.
//   For any non-zero number, the repeated digit sum equals:
//       1 + (num - 1) % 9
//   Handle zero as a special case.
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public int addDigits(int num) 
    {
        if(num==0) return 0;
        return 1+(num-1)%9;
    }
}
