class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
       // int res=n/3;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        /*for(Integer i : map.keySet()){
            if(map.get(i) > nums.length/3){
                list.add(i);
            }
        }*/
        
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue() > nums.length/3){
                list.add(entry.getKey());
            }
        }
        return list;
        
    }
}