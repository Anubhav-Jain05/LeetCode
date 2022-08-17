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
    public int sumOfLeftLeaves(TreeNode root) {
       // List<Integer>list = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            return 0;
        }
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            int cnt = q.size();
            //int sum=0;
            for(int i=0;i<cnt;i++){
                TreeNode node = q.poll();
                if(node.left!=null  && node.left.left==null && node.left.right==null){
                    sum += node.left.val;
                }
                if(node.left!=null){
                   // sum += node.left.val;
                    //node.left.val += node.val;
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
           // list.add(sum);
        }
        return sum;
        
        
    }
}