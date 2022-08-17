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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            double sum=0.0;
            int cnt=q.size();
            for(int i=0;i<cnt;i++){
                TreeNode node = q.poll();
                sum += node.val;
                
                
                if(node.left!=null){
                   // node.left.val += node.val; 
                    q.add(node.left);
                }
                if(node.right!=null){
                   // node.right.val += node.val;
                    q.add(node.right);
                }
            }
            list.add(sum/cnt);
        }
        return list;
    }
}