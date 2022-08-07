class Solution {
    public boolean digitCount(String num) {
       
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length();i++){
            int ch = Character.getNumericValue(num.charAt(i));
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
//int idx=0;
        for(int i=0;i<num.length();i++){
            int idx=0;
            if(map.containsKey(i)){
                idx=map.get(i);
            }
           if(idx!=Character.getNumericValue(num.charAt(i))){
               return false;
           } 
        }
        return true;
    }
}