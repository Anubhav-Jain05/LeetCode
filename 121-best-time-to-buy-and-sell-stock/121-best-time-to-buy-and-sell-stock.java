class Solution {
    public int maxProfit(int[] prices) {
       /* int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] > prices[i]){
                    int sum=prices[j]-prices[i];
                    max=Math.max(max,sum);
                   // return max;
                }
            }
        }
        return max;*/
        
        
        int max =0;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            max= Math.max(max,prices[i]-min);
        }
        return max;
    }
}