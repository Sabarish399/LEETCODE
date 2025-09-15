// Problem: 278. First Bad Version
// Link: https://leetcode.com/problems/first-bad-version/
// Approach: Use binary search. 
//           Keep narrowing the search space based on isBadVersion(mid).
//           Stop when left == right, which will be the first bad version.
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class Solution extends VersionControl 
{
    public int firstBadVersion(int n) 
    {        
        int left = 1;
        int right = n;
        while(left < right)
        {
            int mid = left + (right - left)/2;
            if(isBadVersion(mid))
                right = mid;
            else
                left = mid+1;
        }
        return left;
    }
}
