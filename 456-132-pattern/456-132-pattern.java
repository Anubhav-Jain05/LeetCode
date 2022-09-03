class Solution {
    public boolean find132pattern(int[] nums) {
       
        // TLE
        
       /* for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i] < nums[k] && nums[k] < nums[j]){
                        return true;
                    }
                }
            }
        }
        return false;*/
        
        //TLE
        
       /* int min= nums[0];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(min < nums[j] && nums[j] < nums[i]){
                    return true;
                }
                 min= Math.min(min,nums[i]);
            }
           
         }
        return false;*/
        
        Stack<Integer> st = new Stack<>();
        int second= Integer.MIN_VALUE;
        for(int i= nums.length-1;i>=0;i--){
            if(nums[i] < second)
                return true;
            
            while(!st.isEmpty() && nums[i] > st.peek())
                second=st.pop();
                st.push(nums[i]);
            
        }
        return false;
    }
}