class Solution {
    public int singleNonDuplicate(int[] nums) {
       /* for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count<2){
                return nums[i];
            }
        }
        return 0;*/
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()<2){
                return entry.getKey();
            }
        }
        return 0;
    }
}