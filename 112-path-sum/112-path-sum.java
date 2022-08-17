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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            return false;
        }
        q.add(root);
        int s=0;
        while(!q.isEmpty()){
           // List<Integer> sum=new ArrayList<>();
           int cnt = q.size();
            for(int i=0;i<cnt;i++){
                TreeNode node= q.poll();
                if(node.left==null && node.right==null){
                    if(node.val==targetSum){
                        return true;
                    }
               }
                //sum.add(node.val);
            
                //if(s==targetSum){
                  //  return true;
                //}
                if(node.left!=null){
                    node.left.val += node.val;
                    q.add(node.left);
                }
                if(node.right!=null){
                    node.right.val += node.val;
                    q.add(node.right);
                }
                
            }
        }
            
        return false;
        
    }
}