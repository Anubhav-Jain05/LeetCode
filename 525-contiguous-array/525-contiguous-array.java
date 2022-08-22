class Solution {
    public int findMaxLength(int[] nums) {
        /*int length=0;
        for(int i=0;i<nums.length;i++) {
            int zero=0,one=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zero++;
                }else{
                    one++;
                }
                if(zero==one){
                length=Math.max(length,j-i+1);
            
                }
               
            }
         }
        return length;*/
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        int max=0;
        for(int i=0;i<nums.length;i++){
          // sum +=nums[i]==1?1:-1;
            if(nums[i]==1){
                sum++;
            }else{
                sum--;
            }
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}