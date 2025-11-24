// Problem: 1018. Binary Prefix Divisible By 5
// Link: https://leetcode.com/problems/binary-prefix-divisible-by-5/
// Approach: Maintain the current prefix modulo 5. For each bit, update:
//           res = (res * 2 + bit) % 5
//           If res == 0, the current prefix is divisible by 5.
// Time Complexity: O(n)
// Space Complexity: O(n) – output list

class Solution 
{
    public List<Boolean> prefixesDivBy5(int[] nums) 
    {
        List<Boolean> list = new ArrayList<>();
        int res = 0;

        for(int n:nums)
        {
            res = ((res * 2)+n)%5;
            list.add(res==0);
        }
        return list;
    }
}
