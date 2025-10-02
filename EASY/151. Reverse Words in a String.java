// Problem: 151. Reverse Words in a String
// Link: https://leetcode.com/problems/reverse-words-in-a-string/
// Approach: Trim leading/trailing spaces, then split the string by one or more spaces using regex. 
//           Traverse the words array in reverse order and append them to a StringBuilder, 
//           separating by spaces.
// Time Complexity: O(n), where n is the length of the string (split and traversal).
// Space Complexity: O(n), for storing the split words and the result string.

class Solution 
{
    public String reverseWords(String s) 
    {
       String[] words = s.trim().split("\\s+");
       StringBuilder sb= new StringBuilder();

       for(int i=words.length-1;i>=0;i--)
       {
            sb.append(words[i]);
            if(i>0)
                sb.append(" ");
       } 
        return sb.toString();
    }
}
