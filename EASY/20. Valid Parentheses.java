// Problem: 20. Valid Parentheses
// Link: https://leetcode.com/problems/valid-parentheses/
//
// Approach (Stack):
// - Use a stack to store opening brackets.
// - Traverse each character in the string:
//     • If it is an opening bracket ('(', '[', '{'), push onto stack.
//     • Otherwise (closing bracket):
//         - If stack is empty → return false.
//         - Pop top element.
//         - Check if it matches the correct opening bracket.
//           If not, return false.
// - After traversal, return true only if stack is empty.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{') stack.push(c);
            else
            {
                if(stack.isEmpty()) return false;
                else
                {
                    char top = stack.pop();

                    if( (c==')' && top !='(') || (c==']' && top != '[') || (c=='}' && top != '{')) return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
