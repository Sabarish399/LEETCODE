// Problem: 394. Decode String
// Link: https://leetcode.com/problems/decode-string/
// Approach:
// - Use two stacks: one for counts (`countStack`) and one for partial strings (`stringStack`).
// - Traverse each character in the input string:
//     • If it's a digit, build the multiplier `k`.
//     • On encountering '[', push `k` and the current string onto their stacks, then reset for the next segment.
//     • On encountering ']', pop the last string and count, and repeat the current substring accordingly.
//     • For letters, directly append to the current StringBuilder.
// - The final `curr` StringBuilder contains the decoded string.
// Time Complexity: O(n) — each character is processed once.
// Space Complexity: O(n) — due to the use of two stacks.

class Solution 
{
    public String decodeString(String s) 
    {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) 
        {
            if (Character.isDigit(c)) k = k * 10 + (c - '0'); 
            else if (c == '[') 
            {
                countStack.push(k);       
                stringStack.push(curr);   
                curr = new StringBuilder(); 
                k = 0;
            } 
            else if (c == ']') 
            {
                int repeat = countStack.pop();
                StringBuilder decoded = stringStack.pop();
                for (int i = 0; i < repeat; i++) 
                {
                    decoded.append(curr);
                }
                curr = decoded;
            } 
            else curr.append(c);
        }
        return curr.toString();
    }
}
