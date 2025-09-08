// Problem: 1295. Find Numbers with Even Number of Digits
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Approach: For each number, count its digits by dividing by 10. If the digit count is even, increase the result counter.
// Time Complexity: O(n * log(m)) where m is the maximum number value
// Space Complexity: O(1)

class Solution 
{
    public int findNumbers(int[] nums) 
    {
        int evenDigitNums=0;
        for(int i:nums)
        {
            int digit=0;
            do
            {
                i = i/10;
                digit++;
            }while(i!=0);
            
            if(digit%2==0)
                evenDigitNums++;
        }
        return evenDigitNums;
    }
}
