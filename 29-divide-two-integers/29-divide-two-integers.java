class Solution {
    public int divide(int dividend, int divisor) {
       // if(divisor==-1){
         //   return Math.abs(dividend-1);
        //}
        
        if (Integer.MIN_VALUE == dividend && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int res=0;
        res=dividend/divisor;
        return res;
    }
}