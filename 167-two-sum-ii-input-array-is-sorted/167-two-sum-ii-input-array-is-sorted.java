class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /* int arr[]= new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                   arr[0]=i+1;
                    arr[1]=j+1;
                }
            }

        }
        return arr;*/    //TLE
        
        int[] arr = new int[2];
        int low=0;
        int high=numbers.length-1;
        while(low<high){
            int res=numbers[low]+numbers[high];
            if(res==target){
                arr[0]=low+1;
                arr[1]=high+1;
                break;
            }else if(res < target){
                low++;
            }else if(res > target){
                high--;
            }
        }
        return arr;
    }
}