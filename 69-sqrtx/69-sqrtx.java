class Solution {
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int low=1;
        int high=x/2;
        
        while(low<high){
            int mid= ((low+high)/2)+1;
            int div=x/mid;
            if(div== mid){
                return mid;
            }else if(div > mid) {
                low=mid;
            }else{
                high=mid-1;
            }
        }
    return low;
    }
}