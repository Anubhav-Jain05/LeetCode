class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right=height.length-1;
        int max=0;
        while(left < right){
            int wid=right-left;
            int hig=Math.min(height[right],height[left]);
            int area=wid * hig;
            max=Math.max(max,area);
            if(height[left] < height[right]){
                left++;
            }else if(height[left] > height[right]){
                right--;
            }else{
                left++;
                right--;
            }
        }
        return max;
    }
}