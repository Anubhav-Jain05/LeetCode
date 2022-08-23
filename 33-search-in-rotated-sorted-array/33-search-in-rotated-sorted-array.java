class Solution {
    public int search(int[] nums, int target) {
        /*for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;*/
        //Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }
            if(nums[high] >= nums[mid]){
                if(target > nums[mid] && target <= nums[high] ){
                    low=mid+1;
                    
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}