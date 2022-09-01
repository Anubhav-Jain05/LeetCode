class Solution {
    public boolean search(int[] nums, int target) {
       /* for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;*/
        
      /*  int low=0;
        int high= nums.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid] < target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return false;*/
        
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            
            if(nums[mid]==target){
                return true;
            }
            
            if(nums[mid] < nums[high] || nums[mid] < nums[low]){
                if(target > nums[mid] && target <= nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }else if(nums[mid] > nums[low] || nums[mid] > nums[high]){
                if(target < nums[mid] && target >= nums[low]){
                    high=mid-1;;
                }else {
                    low=mid+1;
                }
            }
            else {
                high--;
            }
        }
        return false;
    }
}