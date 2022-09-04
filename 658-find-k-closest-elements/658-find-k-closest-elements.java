class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       /* List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<k;j++){
              if((arr[i]-x) <= (arr[j]-x) && arr[i] < arr[j]){
                  list.add(arr[i]);
              }
           }
        }
        return list;*/
        
        int i=0;
        int j=arr.length-1;
        while(j-i >= k){
            if(Math.abs(arr[i]-x) > Math.abs(arr[j]-x)){
                i++;
            }else{
                j--;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int n=i;n<=j;n++){
            list.add(arr[n]);
        }
        return list;
    }
}