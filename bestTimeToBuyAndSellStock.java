class Solution {
    public int maxProfit(int[] prices) {
        /* Loop through the array, with 2 pointers(buy and i)
        * 1. compare potential profit and replace
        * 2. if price is lower than buy, move up buy to this new low price
        * 
        * this trick works because higher prices are only relevant to the current buy price,
        * and if we find a lower price, we should move the first pointer to the new "section"
        */
        
        int profit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                profit = Math.max(profit, prices[i] - buy);
            
            } else {
                buy = prices[i];
            }
        }
        
        return profit;
    }
}

