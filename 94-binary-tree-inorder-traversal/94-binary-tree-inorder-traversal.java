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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> q= new Stack<>();
        if(root==null){
            return list;
        }
        TreeNode curr=root;
        while(curr != null || !q.isEmpty()){
            while(curr != null){
                q.add(curr);
                curr=curr.left;
            }
            curr=q.pop();
            list.add(curr.val);
            curr=curr.right;
        }
        return list;
    }
}