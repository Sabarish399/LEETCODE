//1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        
        int richAll = 0,rich=0;
        for(int[] i:accounts)
        {
            for(int j:i)
            {
                rich+=j;
            }
            if(rich>richAll)
                richAll = rich;
            rich =0;
        }

        return richAll;
    }
}
