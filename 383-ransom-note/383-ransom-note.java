class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       /* HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : ransomNote.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
            
            if(map.get(ch) < 0){
                return false;
            }
        }
        return true;*/
        
        int[] arr= new int[26];
        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(--arr[ransomNote.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
        
    }
}