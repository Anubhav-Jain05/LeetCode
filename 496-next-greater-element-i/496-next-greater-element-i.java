class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int arr[]=new int[nums1.length];
//         int n=nums1.length;
        
//         for(int i=0;i<n;i++){
//             int grea=-1, j= nums2.length-1;
//             while(j > 0 && nums1[i] != nums2[j]){
//                 if(nums2[j]>nums1[i]){
//                     grea=nums2[j];
//                 }
//                 j--;
//             }
//             arr[i]=grea;
//         }
//         return arr;
        
        int arr[]= new int [nums1.length];
        for(int i=0;i<nums1.length;i++){
            int grea=-1,j=nums2.length-1;
            while(j>0 && nums1[i] != nums2[j]){
                if(nums1[i] < nums2[j]){
                    grea=nums2[j];
                }
                j--;
            }
            arr[i]=grea;
        }
        return arr;
    }
}