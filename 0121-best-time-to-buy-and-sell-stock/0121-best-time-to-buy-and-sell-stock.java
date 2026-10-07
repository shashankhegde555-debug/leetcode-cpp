class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int j=0;j<prices.length;j++){
            min=Math.min(min,prices[j]);
            int profit=prices[j]-min;
            max=Math.max(profit,max);
            }
            return max;
        }
    }