class Solution {
    public int subarraySum(int[] arr, int k) {
        int maxsum=0;
        for(int start=0;start<arr.length;start++){
            int sum=0;
            for(int end=start;end<arr.length;end++){
                sum=sum+arr[end];
                if(sum==k){
                    maxsum++;
                }
            }
        }
        return maxsum;
    }
}