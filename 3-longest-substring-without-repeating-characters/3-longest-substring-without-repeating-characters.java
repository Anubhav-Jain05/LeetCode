class Solution {
    public int lengthOfLongestSubstring(String s) {
       /* int max=0;
        HashSet<Character> hs= new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        System.out.print(hs);
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s)){
                max=Math.max(hs.size(),max);
            }
        }
        return max;*/
        
        HashMap<Character,Integer> map = new HashMap<>();
        int i =0, j=0, len=0,n=s.length();
        while(j<n){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j))+1,i);
            }
               map.put(s.charAt(j),j);
               len=Math.max(len,j-i +1);
               j++;
        }
               return len;
    }
}