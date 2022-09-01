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
    public int goodNodes(TreeNode root) {
        return good(root,-10000);
    }
    public int good(TreeNode root,int maxi){
        if(root==null){
            return 0;
        }
        int res=root.val >= maxi?1 :0;
        res +=good(root.left,Math.max(maxi,root.val));
        res += good(root.right,Math.max(maxi,root.val));
        return res;
    }
}