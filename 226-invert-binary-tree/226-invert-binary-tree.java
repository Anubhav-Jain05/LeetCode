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
    public TreeNode invertTree(TreeNode root) {
       /* Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            return root;
        }
        q.add(root);
        while(!q.isEmpty()){
            int cnt=q.size();
            for(int i=0;i<cnt;i++){
                TreeNode node = q.poll();
               // if(i==cnt-1){
                    TreeNode temp=node.right;
                    node.right=node.left;
                    node.left=temp;
                //}
                if(node.right!=null){
                    q.add(node.right);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
            }
        }
        return root;*/
        
        if(root==null){
            return root;
        }
        TreeNode temp= root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        return root;
    }
}