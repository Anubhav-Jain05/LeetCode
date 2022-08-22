class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       /* int max=Integer.MAX_VALUE;
        //int sum =0;
        for(int i=0;i<nums.length;i++){
          int sum =0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum>=target){
                    max=Math.min(max,j-i+1);
                    
                }
            }
        }
        return (max != Integer.MAX_VALUE)?max:0;*/
        if(nums==null || nums.length==0){
            return 0;
        }
        int i=0;
        int j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(j<nums.length){
            sum += nums[j++];
            //j++;
            while(sum >= target){
                min= Math.min(min,j-i);
                sum -= nums[i++];
            }
        }
        
        return min == Integer.MAX_VALUE?0:min;
    }
}