/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> list = new ArrayList<>();
        if(n==1){
            list.add(new TreeNode(0));
            return list;
        }
        n=n-1;
        for(int i=1;i<n;i+=2){
            List<TreeNode> left=allPossibleFBT(i);
            List<TreeNode> right= allPossibleFBT(n-i);
            for(TreeNode nl:left){
                for(TreeNode nr:right){
                    TreeNode curr=new TreeNode(0);
                    curr.left=nl;
                    curr.right=nr;
                    list.add(curr);
                }
            }
        }
        return list;
    }
}