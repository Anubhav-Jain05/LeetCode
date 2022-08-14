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
    public boolean isSymmetric(TreeNode root) {
       /* if(root == null){
            return true;
        }
        return symmetric(root.left,root.right);
        
    }
    public boolean symmetric(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return(p.val == q.val) && symmetric(p.left,q.right) && symmetric(p.right,q.left);*/
        
        if(root==null)return true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode p=queue.poll();
            TreeNode  q=queue.poll();
            if(p==null && q==null){
                continue;
            }
            if(p==null || q==null || p.val!=q.val){
                return false;
            }
            queue.add(p.left);
            queue.add(q.right);
            queue.add(p.right);
            queue.add(q.left);
        }
        return true;
        
    }
}