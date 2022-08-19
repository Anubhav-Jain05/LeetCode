class Solution {
    public String multiply(String num1, String num2) {
        int n= num1.length();
        int m= num2.length();
        int[] pro=new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int mul= ((num1.charAt(i)-'0') * (num2.charAt(j)-'0'));
                pro[i+j+1] += mul;
            }
        }
        int carry=0;
        for(int i=pro.length-1;i>=0;i--){
            int tmp = (pro[i] + carry)%10;
            carry=(pro[i]+carry)/10;
            pro[i]=tmp;
        }
        StringBuilder sb= new StringBuilder();
        for(int i : pro){
            if(!(sb.length()==0 && i==0)){
                sb.append(i);
            }
        }
        return sb.length()==0?"0":sb.toString();
        
    }
}