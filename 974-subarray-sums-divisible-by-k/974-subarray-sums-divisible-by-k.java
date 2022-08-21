class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        /*int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum +=nums[j];
                if(sum%k==0){
                    count++;
                }
            }
        }
        return count;*/
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum =(sum + nums[i])%k;
            if(sum < 0){
                sum += k;
            }
            count += map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}