class Solution {
    public int maxProfit(int[] prices) {
      int maxP=0;
      int minBuy=prices[0];
      for(int i=0;i<prices.length;i++){
        if(prices[i]<minBuy){
          minBuy=prices[i];
        }else{
          int profit=prices[i]-minBuy;
         maxP=Math.max(maxP,profit);
        }
      }return maxP; 
    }
}
