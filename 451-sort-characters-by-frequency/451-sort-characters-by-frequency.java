class Solution {
    public String frequencySort(String s) {
       // String res= new String("");
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            
        }
       /* List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->(map.get(b)-map.get(a))); 
        
        StringBuilder sb = new StringBuilder();
        for(char ch : list){
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();*/
        
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
				
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int)e.getValue(); i++) 
                sb.append(e.getKey());
        }
        return sb.toString();
        
    }
}