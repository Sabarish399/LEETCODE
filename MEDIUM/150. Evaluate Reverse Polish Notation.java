// Problem: 150. Evaluate Reverse Polish Notation
// Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Approach:
// - Use a stack to store operands.
// - Traverse each token in the input array:
//     • If the token is an operator (+, -, *, /):
//         - Pop the top two operands from the stack.
//         - Apply the operator in the correct order.
//           (Order matters for subtraction and division.)
//         - Push the result back onto the stack.
//     • If the token is a number:
//         - Convert it to an integer and push it onto the stack.
// - After processing all tokens, the stack will contain exactly one element,
//   which is the final evaluated result.
//
// Time Complexity: O(n) — each token is processed once.
// Space Complexity: O(n) — stack may store up to n operands.

class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<>(); 
        for(String c : tokens)
        {
            switch(c)
            {
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    int n1 = stack.pop();
                    int n2 = stack.pop();
                    stack.push(n2-n1);
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    int n3 = stack.pop();
                    int n4 = stack.pop();
                    stack.push(n4/n3);
                    break;
                default:
                    stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
