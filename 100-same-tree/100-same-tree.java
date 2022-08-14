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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /*if(p == null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);*/
        
        if(p==null && q==null){
            return true;
        }
        if(p==null && q != null || p !=null && q==null){
            return false;
        }
    
        Stack<TreeNode> stackp = new Stack<>();
        Stack<TreeNode> stackq=new Stack<>();
        stackp.add(p);
        stackq.add(q);
        while(!stackp.isEmpty() && !stackq.isEmpty()){
            TreeNode temp=stackp.pop();
            TreeNode temq=stackq.pop();
            if(temp.val!=temq.val){
                return false;
            }
            if(temp.left !=null && temq.left !=null){
                stackp.push(temp.left);
                stackq.push(temq.left);
            }
            else if(temp.left == null && temq.left == null){
                
            }else{
                return false;
            }
            if(temp.right != null && temq.right != null){
                stackp.push(temp.right);
                stackq.push(temq.right);
            }else if(temp.right== null && temq.right== null){
                
            }else {
                return false;
            }
        }
        if(!stackp.isEmpty() || !stackq.isEmpty()){
            return false;
        }
        return true;
        
    }
}