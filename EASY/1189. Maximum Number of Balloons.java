// Problem: 1189. Maximum Number of Balloons
// Link: https://leetcode.com/problems/maximum-number-of-balloons/
//
// Approach:
// - Count frequency of each character using an array of size 26.
// - Extract required counts for characters in "balloon":
//     • b → freq['b']
//     • a → freq['a']
//     • l → freq['l'] / 2   (since 'l' appears twice)
//     • o → freq['o'] / 2   (since 'o' appears twice)
//     • n → freq['n']
// - The answer is the minimum of these values.
//
// Time Complexity: O(n)
// Space Complexity: O(1

class Solution 
{
    public int maxNumberOfBalloons(String text) 
    {
        int[] freq = new int[26];

        for(char c:text.toCharArray())
        {
            freq[c-'a']++;
        }

        int b = freq['b'-'a'];
        int a = freq['a'-'a'];
        int l = freq['l'-'a']/2;
        int o = freq['o'-'a']/2;
        int n = freq['n'-'a'];

        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));

    }
}
