class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length <= 1) return 0;          //prices=[7,1,5,3,6,4]     1 < 6?
        int i = 0, j = 1;                          //          i         j
        int minBuy = prices[i], maxSell = 0;               //        1 >= 4? NO 
                                                   //        minBuy = 1

        while(j < prices.length){                  //        1 < 4 ? Yes
            if(prices[i] >= prices[j]){          //        maxSell = 6
                minBuy = prices[j];                //        
                i++;
                j++;
            }

            if(j < prices.length && prices[i] < prices[j]){
                maxSell = Math.max(prices[j], maxSell);
                j++;
            }
        }
        if(minBuy >= maxSell){
            return 0;
        }
        return maxSell - minBuy;
    }
}
