// Problem: 636. Exclusive Time of Functions
// Link: https://leetcode.com/problems/exclusive-time-of-functions/
//
// Approach:
// - Use an integer array `res` of size `n` to store exclusive time for each function.
// - Use a stack to simulate the function call stack.
//   Each stack entry stores: [functionId, startTime].
//
// - For each log entry:
//     • Parse function id, type ("start"/"end"), and timestamp.
//     • If stack is NOT empty:
//         - If current log is "start":
//             ▸ Add (currentTime - previousStartTime) to the function at top.
//             ▸ Push new function onto stack.
//         - If current log is "end":
//             ▸ Add (currentTime + 1 - previousStartTime) to top function.
//             ▸ Pop it from stack.
//             ▸ If stack still not empty, update new top's startTime to currentTime + 1.
//     • If stack is empty:
//         - Push the current function onto stack.
//
// - Return result array.
//
// Time Complexity: O(m) — where m = logs.size(), each log processed once.
// Space Complexity: O(n) — stack can grow up to number of nested calls.

class Solution 
{
    public int[] exclusiveTime(int n, List<String> logs) 
    {
        int[] res = new int[n];
        Stack<int[]> stack = new Stack<>();

        for(String log:logs)
        {
            String[] split = log.split(":");

            int id = Integer.parseInt(split[0]);
            String type = split[1];
            int time = Integer.parseInt(split[2]);

            if(!stack.isEmpty())
            {
                int[] peek = stack.peek();

                if(type.equals("start"))
                {
                    res[peek[0]] += time - peek[1];
                    stack.add(new int[]{id,time});
                }
                else
                {
                    time += 1;
                    res[peek[0]] += time - peek[1];
                    stack.pop();
                    if(!stack.isEmpty()) stack.peek()[1] = time;
                }
            }
            else
            {
                stack.push(new int[]{Integer.parseInt(split[0]),time});
            }
        }
        return res;
    }
}
