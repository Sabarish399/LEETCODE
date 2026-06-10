// Problem: 2937. Make Three Strings Equal
// Link: https://leetcode.com/problems/make-three-strings-equal/
//
// Approach:
// - Find the length of the longest common prefix among the three strings.
// - If there is no common prefix, it is impossible to make them equal, so return -1.
// - Otherwise, delete all characters after the common prefix from each string.
// - The total deletions required is the sum of the characters removed from all three strings.
//
// Time Complexity: O(min(n1, n2, n3))
// Space Complexity: O(1)

class Solution 
{
    public int findMinimumOperations(String s1, String s2, String s3) 
    {
        int minLen = Math.min(s1.length(), Math.min(s2.length(),s3.length()) );

        int i=0;

        while( i < minLen && s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) i++;

        if(i==0) return -1;

        int ans = 0;

        ans += s1.length()-i;
        ans += s2.length()-i;
        ans += s3.length()-i;

        return ans;
    }
}
