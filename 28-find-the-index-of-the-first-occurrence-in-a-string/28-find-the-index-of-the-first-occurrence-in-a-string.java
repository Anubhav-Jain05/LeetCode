class Solution {
    public int strStr(String haystack, String needle) {
         
       /*  for(int i=0;i<needle.length();i++){
             for(int j=0;j<haystack.length();j++){
                 char ch = needle.charAt(i);
         char cha = haystack.charAt(j);
                 if(ch==cha){
                     return 0;
                 }
             }
        }
        return -1;*/
        
       // return haystack.indexOf(needle);
        
        int n=haystack.length();
        int m=needle.length();
        
        if(n < m){
            return -1;
        }else if(m==0){
            return 0;
        }
        
        int len=n-m;
        for(int i=0;i<=len;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}