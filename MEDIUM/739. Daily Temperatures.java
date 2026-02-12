// Problem: 739. Daily Temperatures
// Link: https://leetcode.com/problems/daily-temperatures/
//
// Approach (Monotonic Decreasing Stack):
// - Create a result array `res` of size n initialized with 0.
// - Use a stack to store indices of temperatures.
// - Traverse the array from left to right:
//     • While stack is not empty AND current temperature > temperature at stack.peek():
//         - Pop index from stack.
//         - Set res[index] = currentIndex - index.
//     • Push current index onto stack.
// - Remaining indices in stack have no warmer day, so their value remains 0.
// - Return the result array.
//
// Time Complexity: O(n) — each index pushed and popped at most once.
// Space Complexity: O(n) — stack may hold up to n indices.

class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int n = temperatures.length;
        int[] res = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++)
        {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;
    }
}
