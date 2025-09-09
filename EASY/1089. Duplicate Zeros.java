// Problem: 1089. Duplicate Zeros
// Link: https://leetcode.com/problems/duplicate-zeros/
// Approach: Use an extra array. Traverse through the input array, copy elements into the new array. 
//           When a zero is found, add two zeros (if within bounds). Finally, copy new array back.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public void duplicateZeros(int[] arr) 
    {
        int j=0,n=arr.length;
        int[] newArr = new int[n];
      
        for(int i=0;i<n && j<n ;i++)
        {
            if(arr[i]==0)
            {
                newArr[j++]=0;
                if(j<n)
                    newArr[j++]=0;
            }
            else
                newArr[j++] = arr[i];
        } 
      
        for(int i=0;i<n;i++)
        {
            arr[i]=newArr[i];
        }
    }
}
