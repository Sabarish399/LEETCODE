// Problem: 155. Min Stack
// Link: https://leetcode.com/problems/min-stack/
//
// Approach (Single Stack with Pair Storage):
// - Use a list to simulate stack.
// - Each element stores:
//     • [currentMin, value]
// - On push:
//     • If stack empty → min = val.
//     • Else → min = min(previousMin, val).
//     • Store {min, val}.
// - On pop:
//     • Remove last element.
// - top():
//     • Return value from last element.
// - getMin():
//     • Return stored minimum from last element.
//
// Time Complexity:
//     push  → O(1)
//     pop   → O(1)
//     top   → O(1)
//     getMin → O(1)
//
// Space Complexity: O(n)

class MinStack 
{
    List<int[]> stack;
    public MinStack() 
    {
        stack = new ArrayList<>();   
    }
    
    public void push(int val) 
    {
        int[] top = stack.isEmpty() ? new int[]{val,val} : stack.get(stack.size()-1);
        int min = top[0];
        if(min > val) min = val;

        stack.add(new int[]{min,val});
    }
    
    public void pop()
    {
        stack.remove(stack.size()-1);   
    }
    
    public int top() 
    {
        return stack.isEmpty() ? -1 :stack.get(stack.size()-1)[1];
    }
    public int getMin() 
    {
        return stack.isEmpty() ? -1 :stack.get(stack.size()-1)[0];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
