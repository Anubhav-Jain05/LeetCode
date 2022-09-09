class Solution {
    public double myPow(double x, int n) {
          if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        double ans = (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
        
        return ans > 100000 ? 0.0 : ans;
    }
}