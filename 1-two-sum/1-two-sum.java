class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]= new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
        
       /* int[] res= new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;*/
       /* Arrays.sort(nums);
        int[] res=new int[2];
        int i=0;
        int j= nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]<target){
                i++;
            }else if(nums[i]+nums[j]>target){
                j--;
            }else{
                res[0]=i;
                res[1]=j;
                return res;
            }
        }
        return res;*/
    }
}