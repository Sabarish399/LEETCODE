// Problem: 680. Valid Palindrome II
// Link: https://leetcode.com/problems/valid-palindrome-ii/
//
// Approach (Two Pointers + One Deletion Check):
// - Use two pointers: left at start and right at end.
// - Traverse while left < right:
//     • If characters match → move both pointers.
//     • If mismatch occurs:
//         - Try skipping the left character and check if the remaining substring is a palindrome.
//         - Try skipping the right character and check if the remaining substring is a palindrome.
//         - If either is true → return true.
// - If no mismatch occurs → return true.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean validPalindrome(String s) 
    {
        int left=0,right=s.length()-1;
        int end = 1;

        while(left<=right)
        {
            if(s.charAt(left) != s.charAt(right))
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            left++;
            right--;
        }
        return true;
    }
    boolean isPalindrome(String s,int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
            return true;
    }
}
