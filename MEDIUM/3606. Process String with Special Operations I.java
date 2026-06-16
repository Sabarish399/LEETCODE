// Problem: 3606. Process String with Special Operations I
// Link: https://leetcode.com/problems/process-string-with-special-operations-i/
//
// Approach:
// - Traverse the string character by character using a StringBuilder.
// - For each character:
//     • '*' : remove the last character if the builder is non-empty.
//     • '#' : duplicate the current contents of the builder.
//     • '%' : reverse the current contents of the builder.
//     • Otherwise, append the character to the builder.
// - Return the final processed string after applying all operations.
//
// Time Complexity: O(n²)
//     - '#' duplicates the current string and '%' reverses it, both of which
//       can take O(k) time where k is the current length.
// Space Complexity: O(n)

class Solution 
{
    public String processStr(String s) 
    {
        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray())
        {
            if(c == '*')
            {
                if(sb.length() > 0) 
                    sb.deleteCharAt(sb.length()-1);
            }
            else if(c == '#') sb.append(sb.toString());
            else if(c == '%') sb.reverse();
            else sb.append(c);
        }
        return sb.toString();
    }
}
