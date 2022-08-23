class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] arr = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i < m && j < n)
            if(nums1[i] < nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        while(i<m){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        
        double medium =0.0;
        int mid= arr.length/2;
        if(arr.length % 2==1){
            medium= arr[mid];
        }else{
            medium=(arr[mid]+arr[mid-1])/2.0;
        }
        return medium;
        
    }
}