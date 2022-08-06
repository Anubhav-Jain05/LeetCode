class Solution {
    public String firstPalindrome(String[] words) {
      // StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
          StringBuilder sb = new StringBuilder();

            sb.append(words[i]);
            sb.reverse();
            if(words[i].equals(sb.toString())){
                return words[i];
            }   
        }
        return "";
    }
}