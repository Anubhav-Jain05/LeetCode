class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        // int min = Integer.MAX_VALUE;
        for(int i=1;i<prices.length;i++){
          //  min=Math.min(min,prices[i]);
            max += Math.max(0,prices[i]-prices[i-1]);
        }
        return max;
    }
}