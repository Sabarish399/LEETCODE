// Problem: 225. Implement Stack using Queues
// Link: https://leetcode.com/problems/implement-stack-using-queues/
//
// Approach (Single Queue Rotation):
// - Use one queue.
// - push(x):
//     • Add element to queue.
//     • Rotate the queue so the new element comes to the front.
// - pop():
//     • Remove front element.
// - top():
//     • Peek front element.
// - empty():
//     • Check if queue is empty.
//
// Time Complexity:
//     push() → O(n)
//     pop()  → O(1)
//     top()  → O(1)
// Space Complexity: O(n)

class MyStack 
{
    Queue<Integer> q;
    public MyStack() 
    {
        q = new LinkedList<>();
    }
    
    public void push(int x) 
    {
        q.offer(x);

        for(int i=0;i<q.size()-1;i++)
            q.offer(q.poll());

    }
    
    public int pop() 
    {
        return q.poll();
    }
    
    public int top() 
    {
        return q.peek();
    }
    
    public boolean empty() 
    {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
