class Solution {
    public int findPeakElement(int[] nums) { //
       /*int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid] < nums[mid+1]){
                low=mid+1;
                
            }else{
                high=mid;
            }
        }
        return low;*/
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                return i;
            }
        }
        return nums.length-1;
        
        
    }
}


//[1,2,3,1]
//[1,8,2,4,1,2]