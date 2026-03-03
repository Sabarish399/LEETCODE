// Problem: 2678. Number of Senior Citizens
// Link: https://leetcode.com/problems/number-of-senior-citizens/
//
// Approach:
// - Each string has fixed format.
// - Age is stored at index 11 and 12 (0-based).
// - Extract age using character arithmetic:
//     • age = (charAt(11) - '0') * 10 + (charAt(12) - '0')
// - If age > 60, increment counter.
// - Return count.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int countSeniors(String[] details) 
    {
        int count=0;
        for(int i=0;i<details.length;i++)
        {
            int age = (details[i].charAt(11)-'0')*10+(details[i].charAt(12)-'0');
            if(age>60) count++;
        }
        return count;
    }
}
