class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       /* for(char ch:letters){
            if(ch > target){
                return ch;
            }
        }
        return letters[0];*/
        
        int lo=0;
        int high=letters.length;
        while(lo < high){
            int mid=(high+lo)/2;
            if(letters[mid] <= target){
                lo=mid+1;
            }else{
                high=mid;
            }
        }
        return letters[lo % letters.length];
    }
}