class Solution {
    public int maxProfit(int[] prices) {
       int i=0;
        int j=i+1;
        int maxProfit=0;
        while(j < prices.length){
            if(prices[i] < prices[j]){
                int profit = prices[j] - prices[i];
                maxProfit= Math.max(maxProfit,profit);
            }
            j++;
            if(j == prices.length){
                i++;
                j=i+1;
            }
        }
        return maxProfit;
    }
}
