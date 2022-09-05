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
        
        return haystack.indexOf(needle);
    }
}