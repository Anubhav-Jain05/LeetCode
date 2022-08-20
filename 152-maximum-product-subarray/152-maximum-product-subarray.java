class Solution {
    public int maxProduct(int[] nums) {
       /* int pro=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            pro =Math.max(pro*nums[i],nums[i]);
            max= Math.max(max,pro);
        }
        return pro;*/
        
        int res=nums[0];
        int n=nums.length;
        int l=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            l=(l==0?1:l)*nums[i];
            r=(r==0?1:r)*nums[n-1-i];
            res=Math.max(res,Math.max(l,r));
        }
        return res;
    }
}