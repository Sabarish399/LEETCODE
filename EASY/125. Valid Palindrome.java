// Problem: 125. Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/
// Approach:
//   Two-pointer scan from both ends.
//   Skip non-alphanumeric characters, compare letters ignoring case.
//   If all corresponding characters match, it's a palindrome.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean isPalindrome(String s) 
    {
        if(s.isEmpty()) return true;
        
        int start = 0;
        int end = s.length()-1;

        while(start<=end)
        {
            char first = s.charAt(start);
            char last = s.charAt(end);

            if(!Character.isLetterOrDigit(first)) start++;
            else if(!Character.isLetterOrDigit(last)) end--;
            else 
            {
                if(Character.toLowerCase(first) != Character.toLowerCase(last)) return false;

                start++;
                end--;
            }
        }
        return true;
    }
}
