class Solution {
    public boolean checkIfExist(int[] arr) {
       // Arrays.sort(arr);
        /*for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==2*arr[j] && i!=j){
                    return true;
                }
            }
        }
        return false;*/
        HashSet<Float> hm = new HashSet<>();
    
        for(int i=0;i<arr.length;i++){
            if(hm.contains((float)2*arr[i]) || hm.contains((float)arr[i]/2)){
                return true;
            }
           hm.add((float)arr[i]);
        }
        return false;
    }
}