// Problem: 374. Guess Number Higher or Lower
// Link: https://leetcode.com/problems/guess-number-higher-or-lower/
// Approach: Use binary search between 1 and n. 
//           Adjust search space based on guess(mid).
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class Solution extends GuessGame 
{
    public int guessNumber(int n) 
    {
        int left = 1 , right = n , mid = 0;
        
        while(left<=right)
        {
            mid = left+(right-left)/2;
            if(guess(mid) == 0)
                return mid;
            else if(guess(mid) <= 0)
                right = mid-1;   
            else
                left = mid+1;
        } 
        return 0;
    }
}
