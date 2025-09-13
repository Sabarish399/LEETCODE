// Problem: 9. Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Approach: Reverse the number and check if it matches the original. 
//           Negative numbers are not palindrome.
// Time Complexity: O(log n)   // number of digits in x
// Space Complexity: O(1)

class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0) 
            return false;

        int remainder=0,sum=0,tempX = x;
        while(tempX!=0)
        {
            remainder = tempX % 10;
            sum = sum*10+remainder;
            tempX /= 10;
        }
        return sum==x;
    }
}
