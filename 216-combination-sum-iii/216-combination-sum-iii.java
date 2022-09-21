class Solution {
    private void findCombination(int idx, int k,int n,List<List<Integer>> list, List<Integer>                               ans){
        if(ans.size()==k && n == 0){
            List<Integer> res= new ArrayList<>(ans);
            list.add(res);
            return;
        }
        for(int i=idx;i<=9;i++){
            ans.add(i);
            findCombination(i+1,k,n-i,list,ans);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> list = new ArrayList<>();
        findCombination(1,k,n,list,new ArrayList<Integer>());
        return list;
    }
}