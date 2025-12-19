// Problem: 6. Zigzag Conversion
// Link: https://leetcode.com/problems/zigzag-conversion/
// Approach:
//   Observe the zigzag pattern cycle length = 2 * (numRows - 1).
//   Traverse row by row:
//     - For each row i, characters occur at indices j = i + k * cycle.
//     - For middle rows (not first or last), there is an additional diagonal character
//       at index j + cycle - 2 * i if within bounds.
//   Append characters row-wise to build the final string.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public String convert(String s, int numRows) 
    {
        if (numRows == 1) return s;
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < numRows; i++) 
        {
            for (int j = i; j < s.length(); j += (2 * (numRows - 1))) 
            {
                a.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && j + (2 * (numRows - 1)) - (2 * i) < s.length())
                    a.append(s.charAt(j + (2 * (numRows - 1)) - (2 * i)));
            }
        }
        return a.toString();
    }
}
