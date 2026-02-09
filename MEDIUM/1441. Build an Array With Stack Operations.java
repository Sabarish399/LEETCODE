// Problem: 1441. Build an Array With Stack Operations
// Link: https://leetcode.com/problems/build-an-array-with-stack-operations/
// Approach:
// - Initialize an empty list to store stack operations ("Push", "Pop").
// - Use a pointer `j` to track the current index in the `target` array.
// - Iterate from `i = 1` to `n`:
//     • If all elements of `target` are already matched (`j == target.length`),
//       return the operations list immediately.
//     • If `i` matches `target[j]`:
//         - Add "Push" to the list.
//         - Move to the next target element by incrementing `j`.
//     • Otherwise:
//         - Add "Push" followed by "Pop" to discard the number.
// - Return the list of operations.
//
// Time Complexity: O(n) — iterates through numbers from 1 to n.
// Space Complexity: O(n) — stores the sequence of operations.

class Solution 
{
    public List<String> buildArray(int[] target, int n) 
    {
        List<String> stack = new ArrayList<>();
        int j=0;

        for(int i=1;i<=n;i++)
        {
            if(j==target.length) return stack;
            
            if(j<target.length && target[j]==i)
            {
                j++;
                stack.add("Push");
            }
            else
            {
                stack.add("Push");
                stack.add("Pop");
            }
        }
        return stack;
    }
}
