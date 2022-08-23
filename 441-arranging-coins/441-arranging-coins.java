class Solution {
    public int arrangeCoins(int n) {
        long low=0;
        long right=n;
        while(low <= right){
            long mid=(low+right)/2;
            long col=mid * (mid+1)/2;
            if(col==n){
                return (int)mid;
            }
            if(n < col){
                right=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)right;
    }
}