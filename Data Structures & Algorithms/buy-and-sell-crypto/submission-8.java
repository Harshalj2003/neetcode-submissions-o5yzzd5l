class Solution {
    public int maxProfit(int[] prices) {
                                          //[0,6,2,1,0,0]
        if (prices.length <= 1) return 0;      
        int maxProfit = 0; //10

        for (int i = prices.length-1; i >= 0; i--){
            if(maxProfit > prices[i]){
                prices[i] = maxProfit - prices[i];
            }
            else{
                maxProfit = prices[i];
                prices[i] = 0;
            }
        }
        maxProfit = 0;
        for(int i : prices){
            maxProfit = Math.max(maxProfit, i);
        }
        return maxProfit;
    }
}
