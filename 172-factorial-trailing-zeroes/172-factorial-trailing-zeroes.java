class Solution {
    public int trailingZeroes(int n) {
        /*if(n==0 || n==1 || n==2){
            return 0;
        }
        int count=0;
        while(n>0){
            n =n/5;
            count+=n;
        }
        return count*/
        
       /* int count=0;
        while(n>0){
            n=n/5;
            count+=n;
        }
        return count;*/
        
        return n==0?0:n/5 + trailingZeroes(n/5);
    }
}