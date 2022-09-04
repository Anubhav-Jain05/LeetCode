class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        //TLE
        
        /*for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count<2){
                return nums[i];
            }
        }
        return 0;*/
        
        /*HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()<2){
                return entry.getKey();
            }
        }
        return 0;*/
        
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=(high+low)/2;
            if((mid %2==0 && nums[mid]==nums[mid+1] )|| (mid %2==1 && nums[mid]==nums[mid-1])){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }
}