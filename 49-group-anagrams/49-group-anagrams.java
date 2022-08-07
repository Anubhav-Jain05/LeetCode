class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
       HashMap<String,List<String>>  map = new HashMap<>();
        for(String s: strs){
            char[] ch =new char[26];
            for(char c :s.toCharArray()){
                ch[c-'a']++;
            }
            String keypair=String.valueOf(ch);
            if(!map.containsKey(keypair)){
                map.put(keypair,new ArrayList<>());
                
            }
            map.get(keypair).add(s);
        }
        return new ArrayList<>(map.values());*/
        
        if(strs==null || strs.length==0)return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] ch = new char[26];
            for(char c:s.toCharArray()) ch[c-'a']++;
            String keypair = String.valueOf(ch);
            if(!map.containsKey(keypair)) map.put(keypair,new ArrayList<>());
            map.get(keypair).add(s);
        }
        return new ArrayList<>(map.values());
    }
}