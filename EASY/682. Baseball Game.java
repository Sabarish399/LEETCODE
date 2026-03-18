// Problem: 682. Baseball Game
// Link: https://leetcode.com/problems/baseball-game/
//
// Approach (Stack Simulation):
// - Use a stack to store valid round scores.
// - Traverse each operation:
//     • If "+" → sum of last two scores:
//         - Pop top, peek next, compute sum.
//         - Push back original top and new sum.
//     • If "D" → double the last score → push 2 * top.
//     • If "C" → remove last score → pop.
//     • Otherwise → parse integer and push.
// - After processing all operations, sum all values in stack.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int calPoints(String[] operations) 
    {
        Stack<Integer> stack = new Stack<>();

        for(String s:operations)
        {
            if(s.equals("+"))
            {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if(s.equals("D"))
            {
                stack.push(2*stack.peek());
            }
            else if(s.equals("C"))
            {
                stack.pop();
            }
            else
            {
                stack.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(int i:stack) sum += i;
        return sum;
    }
}
