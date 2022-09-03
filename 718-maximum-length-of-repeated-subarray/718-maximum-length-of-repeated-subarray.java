class Solution {
    public int findLength(int[] nums1, int[] nums2) {
       // int[] arr= new int[nums1.length];
       /* int count=0;
        for(int i=0;i<nums1.length;i++){
            
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]!=nums2[j]){
                    //arr[i]=nums1[i];
                    break;
                }
                else {
                    count++;
                }
            }
           // sum ++;
        }
        
        return count;*/
        
        /*int res=0;
        int a=nums1.length;
        int b=nums2.length;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int k=1;
                    while(i + k < nums1.length && j + k <  nums2.length &&                                              nums1[i+k]==nums2[j+k]){
                        k++;
                        res=Math.max(res,k);
                    }
                }
            }
        }
        return res;*/
        
        int ans =0;
        int[][] res=new int[nums1.length+1][nums2.length+1];
        for(int i=nums1.length-1;i>=0;i--){
            for(int j=nums2.length-1;j>=0;j--){
                if(nums1[i]==nums2[j]){
                    res[i][j]=res[i+1][j+1]+1;
                    if(ans < res[i][j]){
                        ans=res[i][j];
                    }
                }
            }
        }
        return ans;
       
    }
}