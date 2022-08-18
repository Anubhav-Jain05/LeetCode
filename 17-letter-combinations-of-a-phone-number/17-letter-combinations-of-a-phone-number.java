class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits==null || digits.length()==0){
            return list;
        }
        list.add("");
        char[][] ch = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        for(int i=0;i<digits.length();i++){
            List<String> res= new ArrayList<>();
            int num=digits.charAt(i)-'0';
            for(String s : list){
                for(int j=0;j<ch[num].length;j++){
                    res.add(s + ch[num][j]);
                }
            }
            list=res;
        }
        return list;
        
    }
}