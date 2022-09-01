class Solution {
    public int findMin(int[] nums) {
       // Arrays.sort(nums);
       /* int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min){
                min= nums[i];
            }
        }
        return min;*/
        
        if(nums.length==1){
            return nums[0];
        }
        
        int low=0;
        int high=nums.length-1;
        
        if(nums[high] > nums[0]){
            return nums[0];
        }
        while(low <= high){
            int mid = (high+low)/2;
            if(nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid] > nums[0]){
                low=mid+1;
            }
            if(nums[mid] < nums[0]){
                high=mid-1;
            }
        }
        return Integer.MAX_VALUE;
    
    }
}