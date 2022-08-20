class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int leftside=nums[0];
        for(int i=1;i<nums.length;i++){
            leftside = Math.max(leftside + nums[i] ,nums[i]);
            max= Math.max(max,leftside);
        }
        return max;
    }
}