// Problem: 3. Longest Substring Without Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Approach:
//   Sliding Window with HashMap.
//   Maintain a window [left, i] with all unique characters.
//   Store the last seen index of each character.
//   When a duplicate is found, move `left` to max(previousIndex + 1, left)
//   to ensure no repeated characters in the window.
//   Update the maximum window length during traversal.
// Time Complexity: O(n)
// Space Complexity: O(min(n, charset)) — HashMap for character indices

class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(s.charAt(i)))
                left = Math.max(map.get(s.charAt(i))+1,left);
            map.put(s.charAt(i),i);
            res = Math.max(res,i-left+1);
        }
        return res;
    }
}
