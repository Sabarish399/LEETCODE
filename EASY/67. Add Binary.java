// Problem: 67. Add Binary
// Link: https://leetcode.com/problems/add-binary/
//
// Approach (Manual Binary Addition):
// - Use two pointers starting from the end of both strings.
// - Maintain a carry variable.
// - While either pointer is valid OR carry exists:
//     • Add carry to sum.
//     • If pointer i >= 0, add (a.charAt(i) - '0') and decrement i.
//     • If pointer j >= 0, add (b.charAt(j) - '0') and decrement j.
//     • Append (sum % 2) to StringBuilder.
//     • Update carry = sum / 2.
// - Reverse the StringBuilder and return result.
//
// Time Complexity: O(max(n, m)) — process each digit once.
// Space Complexity: O(max(n, m)) — result storage.

class Solution 
{
    public String addBinary(String a, String b) 
    {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i >=0 || j >=0 || carry == 1)
        {
            int sum = carry;

            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';

            sb.append(sum%2);
            carry = sum/2;
        }
        return sb.reverse().toString();
    }
}
