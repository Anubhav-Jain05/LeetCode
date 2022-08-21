class Solution {
    public int maxSubArray(int[] nums) {
       /* int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum = Math.max(sum + nums[i] ,nums[i]);
            max= Math.max(max,sum);
        }
        return max;*/
        
        int sum =0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > max){
                max=sum;
            }
            if(sum < 0){
                sum=0;
            }
        }
        return max;
    }
}