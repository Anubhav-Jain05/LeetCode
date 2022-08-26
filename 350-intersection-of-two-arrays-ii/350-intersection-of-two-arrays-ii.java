class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        /*HashMap<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i],map.getOrDefault(nums2[i],0)-1);
            }
        }
        
        int[] res= new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;*/
        ArrayList<Integer> list= new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0;
        while(i < n && j<m){
            int a=nums1[i],b=nums2[j];
            if(a==b){
                list.add(a);
                i++;
                j++;
            }else if(a<b){
                i++;
            }else if(a>b){
                j++;
            }
        }
        int[] res= new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[k]=list.get(k);
        }
        return res;
    }
}