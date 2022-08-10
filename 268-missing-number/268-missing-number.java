class Solution {
    public int missingNumber(int[] nums) {
        /*int arr[]= new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]+1!=nums[i+1]){
                arr[i]=i;
            }
        }
        return arr;*/
        
        int sum=nums.length;
        for(int i=0;i<nums.length;i++){
            sum += i-nums[i];
        }
        return sum;
    }
}