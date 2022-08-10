class Solution {
    public int missingNumber(int[] nums) {
        //int arr[]= new int[nums.length];
       // Arrays.sort(nums);
       /* int sum=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                sum += nums[i];;
            }
        }
        return sum;*/
        
       /* int sum=nums.length;
        //System.out.print(sum);
        for(int i=0;i<nums.length;i++){
            sum += i-nums[i];
            System.out.print(sum);
           System.out.print(i+" ");
            System.out.print(nums[i]);
        }
       // System.out.print(sum);
        return sum;*/
        
        int xor=0;
        int i=0;
        for(i=0;i<nums.length;i++){
            xor=xor^i^nums[i];
        }
        return xor^i;
    }
}