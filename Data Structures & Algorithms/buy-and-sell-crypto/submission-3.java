class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1 || (prices.length == 2 && prices[0] >= prices[1])){
            return 0;
        }
        
        int l = 0, r = l + 1, profit = 0;
        while(r < prices.length){
            if(prices[r] > prices[l]){
                profit = Math.max(prices[r] - prices[l], profit);
            } else {
                l = r;
            }
            r++;
        }
        return profit;
    }
}
