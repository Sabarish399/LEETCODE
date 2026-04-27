// Problem: 232. Implement Queue using Stacks
// Link: https://leetcode.com/problems/implement-queue-using-stacks/
//
// Approach (Two Stacks – Amortized O(1)):
// - Maintain two stacks:
//     • in  → for push operations
//     • out → for pop/peek operations
// - push(x):
//     • Push into 'in'.
// - pop():
//     • If 'out' is empty, move all elements from 'in' → 'out'.
//     • Pop from 'out'.
// - peek():
//     • Same transfer logic as pop, but return top.
// - empty():
//     • Both stacks empty → queue is empty.
//
// Time Complexity:
//     push() → O(1)
//     pop()  → Amortized O(1)
//     peek() → Amortized O(1)
// Space Complexity: O(n)

class MyQueue 
{
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() 
    {
        in = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) 
    {
        in.push(x);
    }
    
    public int pop() 
    {
        peek();
        return out.pop();
    }
    
    public int peek() 
    {
        if(out.isEmpty())
        {
            while(!in.isEmpty())
            {
                out.push(in.pop());
            }
        }
        return out.peek();
    }
    
    public boolean empty() 
    {
        return in.isEmpty() && out.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
