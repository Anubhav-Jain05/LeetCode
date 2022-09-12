class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
             arr[i]=-1;
            for(int j=1;j<nums.length;j++){
                if(nums[(i+j) % nums.length] > nums[i]){
                    arr[i]=nums[(i+j) % nums.length];
                    break;
                }
            }
        }
        return arr;
        
        
        
        
        
        
        
        
        
        
        
        // int n=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[0] < nums[i]){
        //         arr[i]=nums[i];
        //     }else if(nums[nums.length-1]==nums[0]){
        //         arr[i]=nums[0];
        //     }else{
        //         arr[i]=-1;
        //     }
        // }
        // return arr;
        
        
        
        
    }
}