// Problem: 735. Asteroid Collision
// Link: https://leetcode.com/problems/asteroid-collision/
// Approach:
// - Use a Deque (stack) to simulate asteroid collisions.
// - Iterate through each asteroid:
//     - If the current asteroid moves right (positive), push it onto the stack.
//     - If it moves left (negative), compare with the top of the stack (which represents a right-moving asteroid):
//         - If the top asteroid is smaller, it explodes (pop it).
//         - If both are equal in size, both explode.
//         - If the top is larger, the current asteroid is destroyed.
// - After processing all asteroids, the remaining stack represents the final state.
// Time Complexity: O(n) — each asteroid is pushed and popped at most once.
// Space Complexity: O(n) — for the stack.

class Solution
{
    public int[] asteroidCollision(int[] asteroids) 
    {
       Deque<Integer> stack = new ArrayDeque<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && a < 0 && stack.peekLast() > 0) {
                int top = stack.peekLast();
                if (Math.abs(a) > top) {
                    stack.pollLast();
                } else if (Math.abs(a) == top) {
                    stack.pollLast();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.addLast(a);
            }
        }

        int[] result = new int[stack.size()];
        int i = 0;
        for (int val : stack) result[i++] = val;

        return result;
    }
}
