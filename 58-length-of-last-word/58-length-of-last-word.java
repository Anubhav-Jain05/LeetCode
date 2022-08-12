class Solution {
    public int lengthOfLastWord(String s) {
      /*String str= s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;*/
        
       // String str = s.split();
        int count =0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else if (count>0){
                //if(count > 0){
                  return count;
                //}
            }
        }
        return count;
    }
}