// Problem: 2109. Adding Spaces to a String
// Link: https://leetcode.com/problems/adding-spaces-to-a-string/
//
// Approach:
// - Traverse the original string while maintaining a pointer to the spaces array.
// - Before appending each character, check if the current index matches the
//   next position where a space should be inserted.
// - If it does, append a space and move to the next position in the spaces array.
// - Append the current character and continue until the entire string is processed.
// - Return the constructed string.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public String addSpaces(String s, int[] spaces) 
    {
        int spaceIdx = 0;

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(spaceIdx < spaces.length && i == spaces[spaceIdx])
            {
                sb.append(" "); 
                spaceIdx++;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
