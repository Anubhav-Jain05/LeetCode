class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       /* int n=matrix.length;
        int arr[]= new int[n*n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[count++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];*/
        
        
    
        int low=matrix[0][0];
        int high=matrix[matrix.length-1][matrix[0].length-1]+1;
        while(low < high){
            int mid=low+(high-low)/2;
            int j= matrix[0].length-1;
            int count=0;
            for(int i=0;i<matrix.length;i++){
                while(j >= 0 && matrix[i][j] > mid)j--;
                 count += (j+1);
            }
            if(count < k ){
                low= mid + 1;
            }else{
                high= mid;
            }
        }
        return low;
    }
}