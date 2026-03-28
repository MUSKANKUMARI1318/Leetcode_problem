class Solution {
    public int maxProfit(int[] prices) {
        int buyPrices =Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i =0;i<prices.length;i++){
            if(buyPrices < prices[i]){
                int profit = prices[i]-buyPrices;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrices = prices[i];

            }
        }
        return maxProfit;

        
    }
   
}