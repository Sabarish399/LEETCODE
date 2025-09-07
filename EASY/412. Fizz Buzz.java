// Problem: 412. Fizz Buzz
// Link: https://leetcode.com/problems/fizz-buzz/
// Approach: Loop through numbers from 1 to n. For multiples of 3 add "Fizz", for multiples of 5 add "Buzz", and for multiples of both add "FizzBuzz". Otherwise, add the number itself.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public List<String> fizzBuzz(int n) 
    {
        LinkedList<String> list = new LinkedList<>();

        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
                list.add("FizzBuzz");
            else if(i%3==0)
                list.add("Fizz");
            else if(i%5==0)
                list.add("Buzz");
            else 
                list.add(String.valueOf(i));
        }

        return list;
    }
}
