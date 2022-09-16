class Solution {
    public int reverse(int x) {
        long res=0;
        while(x != 0){
            int remainder=x%10;
            x=x/10;
            res=res*10+remainder;
        }
        if(res<Integer.MIN_VALUE || res> Integer.MAX_VALUE){
            return 0;
        }
        return (int)res;
        
    }
}