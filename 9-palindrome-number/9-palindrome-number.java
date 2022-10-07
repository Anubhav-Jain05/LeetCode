class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int temp=x;
        while(x>0){
            int remainder=x%10;
            x=x/10;
            sum=sum*10+remainder;
        }
        System.out.print(sum+"");
        System.out.print(temp+"");
        if(temp==sum){
            return true;
        }
        return false;
        
    }
}