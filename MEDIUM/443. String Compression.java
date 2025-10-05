// Problem: 443. String Compression
// Link: https://leetcode.com/problems/string-compression/
// Approach: Use two pointers — one for reading (`currIndex`) and one for writing (`writeIndex`).  
//           Count consecutive repeating characters, write the character followed by its count (if > 1).  
//           Continue until all characters are processed.
// Time Complexity: O(n), single pass through the array.
// Space Complexity: O(1), in-place modification.

class Solution 
{
    public int compress(char[] chars) 
    {
        int writeIndex = 0 , currIndex = 0 , n = chars.length;
        while(currIndex<n)
        {
            int count = 0;
            char currChar = chars[currIndex];
          
            while(currIndex < n && chars[currIndex] == currChar)
            {
                currIndex++;
                count++;
            }
            chars[writeIndex++]=currChar;
          
            if(count>1)
            {
                for(char c:String.valueOf(count).toCharArray())
                {
                    chars[writeIndex++] = c;
                }
            }
        }
        return writeIndex;
    }
}
