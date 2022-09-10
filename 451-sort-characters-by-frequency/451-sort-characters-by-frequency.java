class Solution {
    public String frequencySort(String s) {
       // String res= new String("");
        HashMap<Character,Integer> map= new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->(map.get(b)-map.get(a))); 
        
        StringBuilder sb = new StringBuilder();
        for(char ch : list){
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}