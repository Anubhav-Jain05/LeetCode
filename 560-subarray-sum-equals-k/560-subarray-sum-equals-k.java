class Solution {
    public int subarraySum(int[] nums, int k) {
        /*int maxsum=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k){
                    maxsum++;
                }
            }
        }
        return maxsum;*/
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
        
    }
}