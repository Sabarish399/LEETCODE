// Problem: 649. Dota2 Senate
// Link: https://leetcode.com/problems/dota2-senate/
// Approach:
// - Use two queues to track the indices of 'R' (Radiant) and 'D' (Dire) senators.
// - Simulate each round:
//     • The senator with the smaller index bans the other (since they act first).
//     • The winning senator gets reinserted into the queue with an updated index (i.e., +n) to represent their turn in the next round.
// - Continue until one queue becomes empty.
// - The remaining queue determines the winning party.
// Time Complexity: O(n) — each senator is added and removed at most once.
// Space Complexity: O(n) — for storing the indices in two queues.

class Solution 
{
    public String predictPartyVictory(String senate) 
    {
        Queue<Integer> qR = new LinkedList<>();
        Queue<Integer> qD = new LinkedList<>();

        int n = senate.length();

        for(int i=0;i<n;i++) 
        {
            if(senate.charAt(i) == 'R') qR.offer(i);
            else qD.offer(i);
        }

        while(!qR.isEmpty() && !qD.isEmpty()) 
        {
            int iR = qR.poll();
            int iD = qD.poll();

            if(iR < iD) qR.offer(n++);
            else qD.offer(n++);
        }

        return (qR.size()>qD.size()) ? "Radiant" : "Dire";
    }
}
