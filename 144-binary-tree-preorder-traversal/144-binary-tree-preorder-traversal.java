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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack <TreeNode> s= new Stack<>();
        if(root==null){
            return list;
        }
        s.push(root);
        while(!s.isEmpty()){
            TreeNode node = s.pop();
            list.add(node.val);
            
            if(node.right != null){
                s.push(node.right);
            }
            if(node.left!=null){
                s.push(node.left);
            }
        }
        return list;
        
    }
}