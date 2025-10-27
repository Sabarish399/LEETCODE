// Problem: 933. Number of Recent Calls
// Link: https://leetcode.com/problems/number-of-recent-calls/
// Approach:
// - Use a Queue to keep track of ping timestamps within the last 3000 milliseconds.
// - For each `ping(t)`:
//     • Add the new timestamp `t` to the queue.
//     • Remove all timestamps less than `t - 3000` (i.e., older than 3000 ms).
//     • The remaining elements in the queue represent valid recent calls.
// - Return the current size of the queue as the count of recent calls.
// Time Complexity: O(1) amortized — each element is added and removed once.
// Space Complexity: O(n) — for storing recent ping timestamps.

class RecentCounter {

    Queue <Integer> q ;
    public RecentCounter() 
    {
        q=new LinkedList<>();
    }
    
    public int ping(int t) 
    {
        q.add(t);
        while(q.peek() < t-3000) q.poll();

        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
